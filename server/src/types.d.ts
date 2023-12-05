declare global {
  namespace NodeJS {
    interface ProcessEnv {
      SQl_USERANE: string
      SQL_PASSWORD: string
      SQL_DATABASE: string
      SQL_SERVER: string
      PORT: string
    }
  }
}

export {}
