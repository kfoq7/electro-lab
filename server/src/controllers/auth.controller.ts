import type { Request, Response, NextFunction } from 'express'
import { getConnection, sql } from '../database'

export const login = async (req: Request, res: Response, next: NextFunction) => {
  try {
    const { username, password } = req.body

    const pool = await getConnection()
    const result = await pool
      .request()
      .input('InputUsername', sql.VarChar, username)
      .input('InputPassword', sql.VarChar, password)
      .execute('authenticateEmployee')

    res.status(200).json({
      ok: true,
      msg: 'Logged',
      result,
    })
  } catch (error) {
    next(error)
    throw error
  }
}
