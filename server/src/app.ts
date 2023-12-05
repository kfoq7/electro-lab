import 'dotenv/config'
import express from 'express'
import morgan from 'morgan'
import { router } from './routes'

const PORT = process.env.PORT ?? 8080

const app = express()

app.use(express.json())
app.use(express.urlencoded({ extended: false }))
app.use(morgan('dev'))

app.use('/api', router)

app.listen(PORT, () => {
  console.log(`Development server at http://localhost:${8080}`)
})
