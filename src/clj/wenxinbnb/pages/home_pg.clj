(ns wenxinbnb.pages.home_pg
    (:use hiccup.core
          hiccup.page
          r0_rich.pages.template_pg)
    (:require [clojure.string :as s]
              [clojure.java.io :refer [file]]
              [me.raynes.laser :as laser]))

(defn index [] (laser/document
   (laser/parse (file "resources/public/t_index.html"))
   (laser/class= "title")
   (laser/content "Wenxin Bed and Breakfast")))

(defn room [] (laser/document
   (laser/parse (file "resources/public/t_room.html"))
   (laser/class= "title")
   (laser/content "Rooms and Rates")))

(defn about [] (laser/document
   (laser/parse (file "resources/public/t_about.html"))
   (laser/class= "title")
   (laser/content "About Us")))
