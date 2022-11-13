(ns potest.core
  (:require [potemkin :as p]
            [potest.lib :as lib]))

(p/import-fn lib/import-fn-add)
(p/import-vars [lib import-var-sub])

(comment
 (import-fn-add 1 2 3)
 (import-var-sub 1 2 3)
 (lib/import-fn-add 1 2 3))
