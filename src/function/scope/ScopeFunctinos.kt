package function.scope

/**
 * What are scope functions? => Makes your code concise and readable
 *
 * Types of scope functions? => Let, Also, With, Apply, Run
 *
 *
 * Key differences between the scope functions =>
 *                  ||
 * There are two main differences between scope functions:
 *                    1                                                   2
 * ====================================             =======================================
 * The way to refer the Context object                            The return value
 *       Either "this" or "it"                      Either the "context object" or" Lambda result"
 *
 *
 *
 *  ========  [When, Where and How to use scope functions?]  =============
 *
 *  WITH => If you want to operate on a non-null object
 *
 *  LET => If you want to just execute the lambda expression on a NULLABLE Object and avoid NullPointerException
 *
 *  RUN => If you want to operate on a NULLABLE Object, execute lambda expression and avoid NullPointerException
 *
 *  APPLY => If you want to initialise or Configure an Object
 *
 *  ALSO  => If you want to do some additional object configuration or operation
 *
 */

