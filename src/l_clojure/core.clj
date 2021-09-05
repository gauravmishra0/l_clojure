(ns l-clojure.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn hey
  [& args]
  (println "Hello"))
;; (hey)

;; def is for declaring vars 
;; defn is for function

(defn Example []
   ;; The below code declares a integer variable
   (def x 1)
   
   ;; The below code declares a float variable
   (def y 1.25)
   
   ;; The below code declares a string variable
   (def str1 "Hello")
   (println x)
   (println y)
   (println str1))
;; (Example)

;; Loops

;; While Statement
;; The 'while' statement is executed by first evaluating the condition expression (a Boolean value), and if the result is true, then the statements in the while loop are executed.

;; Syntax
;; (while(expression)
;;    (do
;;       codeblock))

;; The while statement is executed by first evaluating 
;; the condition expression (a Boolean value), 
;; and if the result is true, then the statements in the 
;; while loop are executed. The process is repeated starting
;; from the evaluation of the condition in the while statement.
;; This loop continues until the condition evaluates to false.
;; When the condition is false, the loop terminates. The program 
;; logic then continues with the statement immediately following 
;; the while statement. Following is the diagrammatic representation
;; of this loop.

;; Example
(defn Example_while []
   (def x (atom 1))
   (while ( < @x 5 )
      (do
         (println @x)
         (swap! x inc))))
(Example_while)

;; In the above example, we are first initializing the value of ‘x’ variable to 1. 
;; Note that we are using an atom value, which is a value which can be modified. 
;; Then our condition in the while loop is that we are evaluating the condition 
;; of the expression to be such as ‘x’ should be less than 5. Till the value of ‘x’ is less than 5,
;; we will print the value of ‘x’ and then increase its value.
;; The swap statement is used to populate the atom variable of ‘x’ with the new incremented value.




;; 	Doseq Statement
;; The ‘doseq’ statement is similar to the ‘for each’ statement which is found in many other programming languages. The doseq statement is basically used to iterate over a sequence.
 
;; Syntax

;; (doseq (sequence)
;;    statement#1)

;; Example

(defn Example_doseq []
   (doseq [n [0 1 2]]
   (println n)))
(Example_doseq)

;; In the above example, we are using the doseq 
;; statement to iterate through a sequence of values 0, 1, and 2 
;; which is assigned to the variable n. For each iteration, 
;; we are just printing the value to the console.


;; Dotimes Statement
;; The ‘dotimes’ statement is used to execute a statement ‘x’ number of times.

;; Loop Statement
;; The loop special form is not like a ‘for’ loop. The usage of loop is the same as the let binding. However, loop sets a recursion point