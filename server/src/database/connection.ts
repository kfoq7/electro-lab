import { Connection } from 'tedious'

const { SQl_USERANE, SQL_PASSWORD, SQL_DATABASE, SQL_SERVER } = process.env

const sqlConfig = {
  user: SQl_USERANE,
  password: SQL_PASSWORD,
  server: SQL_SERVER,
  database: SQL_DATABASE,
  options: {
    encrypt: true,
    trustedConnection: true,
  },
}

export const getConnection = async () => {}

export { sql }
