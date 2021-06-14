# Banu Akman - Java Module 2 Challenge

Build a simple REST web service.

## Structure

Your solution must have the following structural elements:

- Your project must be built using Spring Boot and Spring MVC. Initialize your project using `start.spring.io`.
- Your project must have an in-memory DAO that follows the pattern shown in this module.
- Your REST API must accept and return data in JSON format where appropriate.
- Your REST API must be documented with Swagger. Save the `.yaml` file in the root of your project directory.

## Requirements/Features

This web service is a quote-of-the-day, word-of-the-day, and magic 8-ball service. You must implement and document the following REST APIs:

- Quote API:
  - URI: /quote
  - Method: GET
  - Request Body: None
  - Response Body: Quote
- Quote Object instance variables:
  - id
  - author
  - quote
- Word API
  - URI: /word
  - Method: GET
  - Request Body: None
  - Response Body: Definition
- Definition Object instance variables:
  - id
  - word
  - definition
- Magic 8-ball API:
  - URI: /magic
  - Method: POST
  - Request Body: question
  - Response Body: Answer
- Answer Object instance variables:
  - id
  - question
  - answer


### Additional Requirements

- Your service must contain at least 10 quotes. Quotes must be served up at random.
- Your service must contain at least 10 words and their corresponding definitions. Words and definitions must be served up at random.
- Your service must contain at least six different magic 8-ball responses. Answers from 8-ball must be served up at random.
