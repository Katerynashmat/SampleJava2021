<%-- 
    Document   : index
    Created on : 29 янв. 2021 г., 20:24:09
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fill in the blank</title>
        <link href="https://fonts.googleapis.com/css?family=Heebo:400,500,700|Playfair+Display:700" rel="stylesheet">
        <link rel="shortcut icon" href="File-Blank.ico" type="image/x-icon">
        <style type='text/css'>
            html {
    line-height: 1.15;
    -ms-text-size-adjust: 100%;
    -webkit-text-size-adjust: 100%
}

body {
    margin: 0
}

section {
    display: block
}

h1 {
    font-size: 2em;
    margin: 0.67em 0
}

main {
    display: block
}

a {
    background-color: transparent;
    -webkit-text-decoration-skip: objects
}

img {
    border-style: none
}

button{
    font-family: sans-serif;
    font-size: 100%;
    line-height: 1.15;
    margin: 0;
    overflow: visible;
    text-transform: none;
    -webkit-appearance: button
}

html {
    box-sizing: border-box
}

*,
*:before,
*:after {
    box-sizing: inherit
}

body {
    background: #06101F;
    -moz-osx-font-smoothing: grayscale;
    -webkit-font-smoothing: antialiased
}

img {
    height: auto;
    max-width: 100%;
    vertical-align: middle;
    display: block
}

html {
    font-size: 20px;
    line-height: 30px
}

body {
    color: #7487A3;
    font-size: 1rem
}

body,
button {
    font-family: "Heebo", sans-serif
}

a {
    color: #F9425F;
    text-decoration: none
}

a:hover,
a:active {
    outline: 0;
    text-decoration: underline
}

h1 {
    clear: both;
    color: #fff;
    font-family: "Playfair Display", serif;
    font-weight: 700;
    font-size: 44px;
    line-height: 56px;
    letter-spacing: 0px
}

@media (min-width: 641px) {
    h1 {
        font-size: 48px;
        line-height: 62px;
        letter-spacing: 0px
    }
}

h1 {
    margin-top: 48px;
    margin-bottom: 16px
}

p {
    margin-top: 0;
    margin-bottom: 24px;
    color: #ABCDEF
}

button {
    font-size: 20px;
    line-height: 30px
}

.container {
    width: 100%;
    margin: 0 auto;
    padding-left: 16px;
    padding-right: 16px
}

@media (min-width: 481px) {
    .container {
        padding-left: 24px;
        padding-right: 24px
    }
}

.container {
    max-width: 1128px
}

.mt-0 {
    margin-top: -90px
}

.button {
    position: relative;
    margin-top: 30px;
    display: inline-flex;
    font-size: 14px;
    letter-spacing: 0px;
    font-weight: 700;
    line-height: 16px;
    text-decoration: none !important;
    text-transform: uppercase;
    background-color: #273C5A;
    color: #fff !important;
    border: none;
    border-radius: 2px;
    cursor: pointer;
    justify-content: center;
    padding: 16px 32px;
    height: 48px;
    text-align: center;
    white-space: nowrap;
}

@keyframes bounce {
	0%, 20%, 60%, 100% {
		transform: translateY(0);
		transform: translateY(0);
	}

	40% {
		transform: translateY(-20px);
		transform: translateY(-20px);
	}

	80% {
		transform: translateY(-10px);
		transform: translateY(-10px);
	}
}

.button:hover {
    animation: bounce 1s;
}

.hero {
    text-align: center;
    padding-top: 48px;
    padding-bottom: 24px
}

.hero-copy {
    position: relative
}

.hero-paragraph {
    margin-bottom: 32px
}

.device-mockup {
    position: relative;
    width: 350px;
    height: auto;
    margin: 0 auto;
    -webkit-transform: translateY(40px);
    transform: translateY(40px);
    transition: opacity 0.6s cubic-bezier(0.5, -0.01, 0, 1.005), -webkit-transform 0.6s cubic-bezier(0.5, -0.01, 0, 1.005);
    transition: opacity 0.6s cubic-bezier(0.5, -0.01, 0, 1.005), transform 0.6s cubic-bezier(0.5, -0.01, 0, 1.005);
    transition: opacity 0.6s cubic-bezier(0.5, -0.01, 0, 1.005), transform 0.6s cubic-bezier(0.5, -0.01, 0, 1.005), -webkit-transform 0.6s cubic-bezier(0.5, -0.01, 0, 1.005)
}

.hero-cta {
    max-width: 400px;
    margin-left: auto;
    margin-right: auto;
    margin-bottom: 40px
}

@media (max-width: 639px) {
    .hero-cta .button {
        display: flex
    }
    .hero-cta .button+.button {
        margin-top: 16px
    }
}

@media (min-width: 641px) {
    .hero {
        position: relative;
        text-align: left;
        padding-top: 56px;
        padding-bottom: 12px
    }
    .hero::before {
        content: '';
        position: absolute;
        left: 0;
        bottom: 20px;
        width: 415px;
        height: 461px;
        background-image: url(data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iNDE1IiBoZWlnaHQ9IjQ2MSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4gIDxkZWZzPiAgICA8bGluZWFyR3JhZGllbnQgeDE9IjguNjg1JSIgeTE9IjIzLjczMyUiIHgyPSI5OS40MzUlIiB5Mj0iODUuMDc4JSIgaWQ9ImEiPiAgICAgIDxzdG9wIHN0b3AtY29sb3I9IiMxRDMwNEIiIG9mZnNldD0iMCUiLz4gICAgICA8c3RvcCBzdG9wLWNvbG9yPSIjMUQzMDRCIiBzdG9wLW9wYWNpdHk9IjAiIG9mZnNldD0iMTAwJSIvPiAgICA8L2xpbmVhckdyYWRpZW50PiAgPC9kZWZzPiAgPHBhdGggZD0iTTMxOC4xNzEgNjE2LjY0YzE2MC4wODYgMCA3MDIuNTI3LTIyOC4yNiAyODkuODYyLTI5MC00MTIuNjY2LTYxLjczOC0xMjkuNzc2LTI5MC0yODkuODYyLTI5MFMyOC4zMSAxNjYuNDc5IDI4LjMxIDMyNi42NGMwIDE2MC4xNjMgMTI5Ljc3NSAyOTAgMjg5Ljg2MSAyOTB6IiB0cmFuc2Zvcm09InJvdGF0ZSgtNiAtMTMyNy4wMyAzNTk0LjM4KSIgZmlsbD0idXJsKCNhKSIgZmlsbC1ydWxlPSJldmVub2RkIi8+PC9zdmc+)
    }
    
    .hero-copy {
        padding-top: 88px;
        padding-right: 48px;
        min-width: 448px;
        max-width: 588px
    }
    .hero-title {
        margin-bottom: 24px
    }
    .hero-paragraph {
        margin-bottom: 40px
    }
    .device-mockup {
        max-width: none
    }
    .hero-cta {
        margin: 0
    }
    .hero-cta button {
        min-width: 170px
    }
    .hero-cta button:first-child {
        margin-right: 16px
    }
}

main {
    flex: 1 0 auto
}

.Texta{
    position: relative;
    margin-left: 90px
}

.Texta1{
    position: relative;
    margin-left: 30px
}

.Texta2{
    position: relative;
    margin-left: 70px
}

.radio{
    position: relative;
    margin-left: 75px;
}

.lng{
    position: relative;
    margin-left: 55px
}

.Texta3{
    position: relative;
    margin-left: 95px
}
        </style>
    </head>
    <body>
      <form action="<%=request.getContextPath()%>/Fill_In_The_Blank" method="post">
          <input type="hidden" name="title" value="Submited"/>
      <main>
            <section class="hero">
                <div class="container">
			<div class="hero-copy">
                            <h1 class="hero-title mt-0">Please, fill in the form. Let me know you better!</h1>
                        <p>
                            Name: <input class="Texta" type="text" name="name" required>
                        </p>
                        <p>
                            Family name: <input class="Texta1" type="text" name="familyname" required>
                        </p>
                        <p>
                            Birthday: <input  class="Texta2" type="date" id="start" name="birthday"
                               value="2001-12-12"
                               min="1900-01-01" max="2020-12-31" >
                        </p>
                        <p>
                            Gender: <span class="radio"><input type="radio" name="gender" value="Male">Male</span>
                                    <span class="radio"><input type="radio" name="gender" value="Female">Female</span>
                        </p>
                        <p>
                           Language: <input class="lng" type="checkbox" name="language" value="Ukrainian">Ukrainian</input>
                                     <input class="lng" type="checkbox" name="language" value="English">English</input>  
                                     <input class="lng" type="checkbox" name="language" value="English">German</input> 
                        </p>
                        <p>
                            Email: <input class="Texta3" type="email" name="email" required>
                        </p>
	                        <div class="hero-cta"><input class="button" type="submit" value="Submit"></div>
                    </div>
                </div>
            </section>
      </main>
      </form>
    </body>
</html>
