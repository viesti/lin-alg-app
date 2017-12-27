(defproject lin-alg-app "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [uncomplicate/neanderthal "0.17.2"]]
  :plugins [[lein-with-env-vars "0.1.0"]]
  :env-vars {:DYLD_LIBRARY_PATH "/opt/intel/mkl/lib:/opt/intel/lib"})
