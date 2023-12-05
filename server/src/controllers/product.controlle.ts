import type { Request, Response, NextFunction } from 'express'
import { getConnection, sql } from '../database'

export const getProducts = async (req: Request, res: Response, next: NextFunction) => {
  try {
    const pool = await getConnection()
    const result = await pool.query('')
  } catch (error) {
    next(error)
  }
}
