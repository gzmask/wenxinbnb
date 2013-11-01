(ns richweb.pages.css)

(defn css []
  {:headers {"Content-Type" "text/css"}
   :body "body {
            background-color: #1A1E24;
            background-repeat: no-repeat;
            background-position: 10px 50px;
            background-size: 1280px 800px;
            color: #FFFFFF;
            font-size: 20px;
            font-family: advent-Bd1;}
            /* Prevents slides from flashing */ 
          #slides {
            display:none;}
          .slidesjs-pagination {
            margin: 6px 0 0;
            float: right;
            list-style: none;
          }
          .slidesjs-pagination li {
            float: left;
            margin: 0 1px;
          }
          .slidesjs-pagination li a {
            display: block;
            width: 13px;
            height: 0;
            padding-top: 13px;
            background-image: url(img/pagination.png);
            background-position: 0 0;
            float: left;
            overflow: hidden;
          }
          a.slidesjs-next,
          a.slidesjs-previous,
          a.slidesjs-play,
          a.slidesjs-stop {
            background-image: url(img/btns-next-prev.png);
            background-repeat: no-repeat;
            display:block;
            width:12px;
            height:18px;
            overflow: hidden;
            text-indent: -9999px;
            float: left;
            margin-right:5px;
          }
          a.slidesjs-next {
            margin-right:10px;
            background-position: -12px 0;
          }
          a:hover.slidesjs-next {
            background-position: -12px -18px;
          }
          a.slidesjs-previous {
            background-position: 0 0;
          }
          a:hover.slidesjs-previous {
            background-position: 0 -18px;
          }
          a.slidesjs-play {
            width:15px;
            background-position: -25px 0;
          }
          a:hover.slidesjs-play {
            background-position: -25px -18px;
          }
          a.slidesjs-stop {
            width:18px;
            background-position: -41px 0;
          }
          a:hover.slidesjs-stop {
            background-position: -41px -18px;
          }
          div.content {
            font-size: 20px;}
          div.top_bar {
            height: 4px;
            width: 16%;
            float: left;}
          div.newshead {
            padding: 8px 0px 0px 5px;
            color: #000;
            background-color: #ccc;
            border-radius: 5px;
          }
          div.newsbody {
            padding: 15px 0px 15px 15px;
            border-radius: 8px;
            background-color: #000;
          }
          div.gmap {
           width: 425px;
           height: 350px;
          }
          #navi_bar {
            background-image: url('/img/richever_logo.png');
            background-color: #1A1E24;
            background-repeat: no-repeat;
            background-position: 615px 150px;
            padding: 50px 0px 20px 0px;
            height: 70px;
            -webkit-transition: background-color 500ms ease,height 1500ms ease;
            transition: background-color 500ms ease,height 1500ms ease;}
          #navi_bar:hover {
            background-color: #000;
            height: 200px; }
          @font-face {
            font-family: advent-Re;
            src: url('fonts/advent-Re.otf');}
          @font-face {
            font-family: advent-Lt1;
            src: url('fonts/advent-Lt1.otf');}
          @font-face {
            font-family: advent-Bd1;
            src: url('fonts/advent-Bd1.otf');}
          hr {
            border: 0;
            height: 1px;
            background: #555;
            background: -webkit-gradient(linear, 0 0, 100% 0, from(#1A1E24), to(#1A1E24), color-stop(50%, #555));}
          .nav_bn {
            color:#6C7381;
            font-size: 22px;
            font-family: advent-Re;
            -webkit-transition: color 1s ease,font-size 200ms ease;
            transition: color 1s ease,font-size 200ms ease;}
          :target {
            font-size: 28px;
            color:#FFF;}
          .nav_bn:hover {
            font-size: 28px;
            color:#FFF;}
          .circle {
            width: 140px;
            height: 240px;
            padding: 8px 70px 8px 70px;
            font-size: 25px;
            -moz-border-radius: 70px;
            -webkit-border-radius: 70px;
            border-radius: 70px;}
          .icon1 {
            opacity: 0.5;
            background: #90dd1f;
            background-image: url('/img/design_icon.png');
            background-repeat: no-repeat;
            background-position: 80px 0px;
            padding-top: 95px;
            -webkit-transition: opacity 1s ease, padding-top 1s ease, background-position 2s ease 1s;
            transition: opacity 1s ease, padding-top 1s ease, background-position 2s ease 1s;}
          .icon2 {
            opacity: 0.5;
            background: #1a34a4;
            background-image: url('/img/store_icon.png');
            background-repeat: no-repeat;
            background-position: 80px 0px;
            padding-top: 95px;
            -webkit-transition: opacity 1s ease, padding-top 1s ease, background-position 2s ease 1s;
            transition: opacity 1s ease, padding-top 1s ease, background-position 2s ease 1s;}
          .icon3 {
            opacity: 0.5;
            background: #fce700;
            background-image: url('/img/service_icon.png');
            background-repeat: no-repeat;
            background-position: 80px 0px;
            padding-top: 95px;
            -webkit-transition: opacity 1s ease, padding-top 1s ease, background-position 2s ease 1s;
            transition: opacity 1s ease, padding-top 1s ease, background-position 2s ease 1s;}
          .icon1:hover, .icon2:hover, .icon3:hover {
            opacity: 1.0;
            padding-top: 259px;
            background-position: -350px 0px;
          }
          #loading {
            padding: 150px 0 0 615px;
            overflow:hidden;
            position: absolute;
            z-index: 10;
            height: 100%;
            -webkit-transition: opacity 2s ease, visibility 0s linear 2s;
            transition: opacity 2s ease, visibility 0s linear 2s;
          }
          @-ms-keyframes rotation {
            from {-ms-transform: rotate(0deg);}
            to {-ms-transform: rotate(359deg);}
          }
          @-webkit-keyframes rotation {
            from {-webkit-transform: rotate(0deg);}
            to {-webkit-transform: rotate(359deg);}
          }
          @keyframes rotation {
            from {transform: rotate(0deg);}
            to {transform: rotate(359deg);}
          }
          #rotation_logo {
            -webkit-animation: rotation 2s infinite linear;
            -ms-animation: rotation 2s infinite linear;
            animation: rotation 2s infinite linear;
          }
          a.icon:link {opacity: 1.0; background-color: #1A1E24; padding: 5px; color:#888;}
          a.icon:visited {opacity: 1.0; color:#888; }
          a.icon:hover {opacity: 1.0; color:#fff; text-decoration: none;}
          a.icon:active {opacity: 1.0; color:#fff;}
          a.nav_bn:link {color:#6C7381;}
          a.nav_bn:visited {color:#6C7381; }
          a.nav_bn:hover {text-decoration: none;color:#FFF; }
          a.nav_bn:active {color:#6C7381;}
          "})

