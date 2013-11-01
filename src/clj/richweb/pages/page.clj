(ns richweb.pages.page
  (:use richweb.pages.template)
  (:require [clojure.string :as s]))

(defn def_page [title body]
  "compose page, convert title as id"
  (list
    [:hr]
    [:h2.offset5 title]
    [:hr]
    [:div.row-fluid {:id (str "pg_" (s/lower-case (s/replace title #"_|-|\s" "")))}
     body]))

(def home_pg (pages (def_page "Richever Tech Ltd"
                (list
                 [:div.row-fluid
                  [:div.span3.offset1.circle.icon1 [:a.circle.icon {:href "/web"} "Web Design"]]
                  [:div.span3.circle.icon2 [:a.circle.icon {:href "/store"} "Regina Store"]]
                  [:div.span3.circle.icon3 [:a.circle.icon {:href "/pcrepair"} "PC Service"]]]
                 [:br] [:br]
                 [:div#news_feed.row-fluid
                  [:div.newshead.span2.offset1 "atitle"]
                  [:div.newsbody.span7 "content"]
                  [:div.newstime.span2 "time"]]))))

(def store_pg (pages (def_page "Regina Richever Store" 
                        (list
                        [:div.row-fluid 
                          [:div#slides.span8.offset2 
                            [:img {:src "/img/store_gallery/003.jpg"}] 
                            [:img {:src "/img/store_gallery/001.jpg"}] 
                            [:img {:src "/img/store_gallery/002.jpg"}]]]
                        [:br]
                        [:div#news_feed.row-fluid
                         [:div.newshead.span2.offset1 "atitle"]
                         [:div.newsbody.span7 "content"]
                         [:div.newstime.span2 "time"]]))))
(def port_pg (pages (def_page "Portfolio"
                        [:div#news_feed.row-fluid
                         [:div.newshead.span2.offset1 "atitle"]
                         [:div.newsbody.span7 "content"]
                         [:div.newstime.span2 "time"]])))
(def about_pg (pages (def_page "About"
                       (list
                       [:div.row-fluid.offset2
                         [:iframe {:width "425"
                                   :height "350"
                                   :frameborder "0"
                                   :scrolling "no"
                                   :marginheight "0"
                                   :src "https://www.google.com/maps?sll=50.456734183219375,-104.61224801231195&sspn=0.00611299109450911,0.009151063792004675&t=m&q=2139+8+Ave,+Regina,+SK,+Canada&dg=opt&ie=UTF8&hq=&hnear=2139+8+Ave,+Regina,+Saskatchewan+S4R+1G1,+Canada&z=14&ll=50.456725,-104.612243&output=embed"}]] 
                       [:br]
                       [:div.offset2.row-fluid
                        [:div.span3
                         [:div.row-fluid "Office Hours:"]
                         [:br]
                         [:div.row-fluid "Monday: 11am ~ 6pm"]
                         [:br]
                         [:div.row-fluid "Tuesday: 11am ~ 6pm"]
                         [:br]
                         [:div.row-fluid "Wednesday: 11am ~ 6pm"]
                         [:br]
                         [:div.row-fluid "Thursday: 11am ~ 6pm"]
                         [:br]
                         [:div.row-fluid "Friday: 11am ~ 6pm"]
                         [:br]
                         [:div.row-fluid "A.K.A 11 am to 6 pm except Weekend"]] 
                        [:div.span3 "2139 8th Avenue Regina S4R 1G1" [:br][:br] "Tel 306-352-RICH(7424)"]]
                       [:br]
                       [:div#news_feed.row-fluid
                        [:div.newshead.span2.offset1 "atitle"]
                        [:div.newsbody.span7 "content"]
                        [:div.newstime.span2 "time"]]))))
(def webdev_pg (pages (def_page "Web Design"
                        (list
                        [:div.row-fluid
                         [:iframe.offset2 {:width "853"
                                   :height "480"
                                   :src "//www.youtube.com/embed/QopKN_VxxF8"
                                   :frameborder "0"
                                   :allowfullscreen "allowfullscreen"}]]
                        [:br] [:br]
                        [:div#news_feed.row-fluid
                         [:div.newshead.span2.offset2 "atitle"]
                         [:div.newsbody.span6 "content"]
                         [:div.newstime.span2 "time"]]))))
(def repair_pg (pages (def_page "PC Repair service"
                        [:div#news_feed.row-fluid
                         [:div.newshead.span2.offset1 "atitle"]
                         [:div.newsbody.span7 "content"]
                         [:div.newstime.span2 "time"]])))
(def no_pg (pages (def_page "404"
                        [:div#news_feed.row-fluid
                         [:div.newshead.span2.offset1 "atitle"]
                         [:div.newsbody.span7 "content"]
                         [:div.newstime.span2 "time"]])))

