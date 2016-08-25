(ns learning-collections.core)

;; Comments come after two semicolons.

(+ 1 1)
;;returns 2

(+ 1/2 1/3)
;;returns 0.833333333333334
;;Just discovered this is an error in proto-repl, the atom extension I'm using.
;;Should return 1/6, which it does in the lein REPL.
;;I submitted an issue to the proto-repl GitHib

(str "Hello" " World!")
;;returns "Hello World!"
