(ns richweb.pages.template
  (:require [clojure.string :as s]))

(defn def_nav [navs icons]
  (list (map (fn [nav icon]
               (list [:div.span2 [:a.nav_bn {:href (str "/" (s/lower-case (s/replace nav #"_|-|\s" "")) "#" (s/replace nav #"_|-|\s" ""))}[:i {:class icon :id (s/replace nav #"_|-|\s" "")} nav]]]))
             navs icons)))

(def nav_bar (def_nav ["Home" "Store" "Web" "PC Repair" "Portfolio" "About"]
                      ["icon-home" "icon-truck" "icon-pencil" "icon-wrench" "icon-book" "icon-info-sign"]))

(defn pages [content]
  "get page by pagename"
  (list
   [:head
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
    [:meta {:content "cc9d2c70d8838f49" :property "wb:webmaster"}]
    [:title "Richever Technology Ltd"]
    [:script {:src "http://code.jquery.com/jquery-latest.min.js" :type "text/javascript"}]
    [:script {:src "/vendor/slidejs/jquery.slides.min.js" :type "text/javascript"}]
    [:script {:src "/vendor/slidejs/slide.js" :type "text/javascript"}]
    [:script {:src "/ie.js" :type "text/javascript"}]
    [:link {:type "text/css" :rel "stylesheet" :href "/vendor/bootstrap/css/bootstrap.min.css"}]
    [:link {:type "text/css" :rel "stylesheet" :href "/vendor/bootstrap/css/bootstrap-responsive.css"}]
    [:link {:type "text/css" :rel "stylesheet" :href "/vendor/font-awesome/css/font-awesome.min.css"}]
    [:link {:type "text/css" :rel "stylesheet" :href "/style.css"}]]
   [:body
    [:div#loading [:img#rotation_logo {:src "/img/richever_logo.png"}] [:br] [:h3 "loading..."]]
    [:div.row-fluid [:div.top_bar {:style "background-color:#ccc"} " "]
                    [:div.top_bar {:style "background-color:#031F73"} " "]
                    [:div.top_bar {:style "background-color:#0A96A6"} " "]
                    [:div.top_bar {:style "background-color:#F2B138"} " "]
                    [:div.top_bar {:style "background-color:#F26A1B"} " "]
                    [:div.top_bar {:style "background-color:#BF2C0B"} " "]]
    [:div#navi_bar.row-fluid nav_bar]
    content
    [:script {:src "/app.js" :type "text/javascript"}]]))
