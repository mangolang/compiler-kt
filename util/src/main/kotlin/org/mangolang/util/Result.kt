
/* Mango compiler (mangolang.org) | Apache 2.0 license, © 2018. */

package org.mangolang.util

/**
 * This 'enum' represents the result of an operation that may fail. It has two options.
 */
sealed class Result<Value, Error>

/**
 * This is the Result value for operations that succeeded.
 */
data class Success<Value, Error>(val value: Value) : Result<Value, Error>()

/**
 * This is the result value for operations that failed.
 */
data class Failure<Value, Error>(val error: Error) : Result<Value, Error>()
