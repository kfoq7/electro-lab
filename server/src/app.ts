import express from 'express'
import morgan from 'morgan'

const PORT = process.env.PORT ?? 8080

const app = express()

app.use(morgan('dev'))

app.get('/', (_req, res) => {
  res.send('Hello world')
})

app.listen(PORT, () => {
  console.log(`Starting development server at http://localhost:${8080}`)
})
