# fx-hello-world

Hello world program for using feature expressions with Clojure and lein-cljsbuild.

To check things out in Clojure, open a repl, require and invoke `fx-hello-world.hello/hello`.

To check things out in ClojureScript, hit `lein cljsbuild once`,
inspect the end of the output file in `target/fx-hello-world.js` and
validate that it emitted the correct JavaScript code. Include it into
a HTML page and call it via the web inspector, if you're feeling
ambitious.
