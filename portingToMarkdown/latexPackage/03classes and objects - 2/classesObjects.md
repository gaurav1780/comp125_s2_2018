---
generator: pdf2htmlEX
---

<div id="sidebar">

<div id="outline">

-   [Overview](#pf3){.l}
-   [this keyword](#pf4){.l}
-   [Comparing objects (compareTo method)](#pf6){.l}
    -   [compareTo in action](#pf9){.l}
-   [Multi-criteria comparison](#pfb){.l}
-   [Unit testing methods of a class](#pfd){.l}
-   [JUnit testing](#pfe){.l}
    -   [Corrected version by looking at JUnit failure](#pf10){.l}
-   [Static members vs. Instance members](#pf10){.l}
    -   [Static member access](#pf11){.l}
    -   [Instance member access](#pf12){.l}
    -   [Typical static methods](#pf12){.l}
-   [Manipulating references](#pf13){.l}
    -   [Shallow copy](#pf14){.l}
    -   [Deep copy](#pf15){.l}
    -   [Copy constructor](#pf18){.l}
        -   [Copy constructor call](#pf19){.l}
-   [Sample solutions for exercises](#pf1a){.l}

</div>

</div>

<div id="page-container">

<div id="pf1" class="pf w0 h0" data-page-no="1">

<div class="pc pc1 w0 h0">

![](data:image/png;base64,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){.bi
.x0 .y0 .w1 .h1}
<div class="t m0 x1 h2 y1 ff1 fs0 fc0 sc0 ls0 ws0">

WCOM125/[]{._ ._0}COMP125

</div>

<div class="t m0 x2 h2 y2 ff1 fs0 fc0 sc0 ls0 ws0">

F[]{._ ._0}undamentals[ ]{._ ._1}of[ ]{._ ._1}Computer[ ]{._ ._1}Science

</div>

<div class="t m0 x3 h2 y3 ff1 fs0 fc0 sc0 ls0 ws0">

Classes[ ]{._ ._1}and[ ]{._ ._1}Objects[ ]{._ ._1}-[ ]{._ ._1}2

</div>

<div class="t m0 x4 h3 y4 ff2 fs1 fc0 sc0 ls0 ws0">

Gaurav[ ]{._ ._2}Gupta

</div>

<div class="t m0 x5 h4 y5 ff3 fs1 fc0 sc0 ls0 ws0">

A[]{._ ._3}pril[ ]{._ ._4}18,[ ]{._ ._4}2018

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

1

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf2" class="pf w0 h0" data-page-no="2">

<div class="pc pc2 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAABfCAIAAABKnOD7AAAACXBIWXMAABYlAAAWJQFJUiTwAAABjUlEQVR42u3WsREAIAwDscD+47oPc5iTRvjqJ8kAAFBnd0UAAKhzbBwAQKMrAQCAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAICNAwCwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAgI0DALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwCAjQMAsHEAANg4AABsHADAt5KIAABQ5wFGnAxqL8vUgwAAAABJRU5ErkJggg==){.bi
.x7 .y7 .w2 .h6}
<div class="t m0 x8 h3 y8 ff4 fs1 fc0 sc0 ls0 ws0">

Contents

</div>

<div class="t m0 x7 h7 y9 ff1 fs2 fc1 sc0 ls0 ws0">

1[ ]{._ ._5}Overview[ ]{._ ._6}[4]{.fc0}

</div>

<div class="t m0 x7 h7 ya ff1 fs2 fc1 sc0 ls0 ws0">

2[ ]{._ ._7}[this[ ]{._ ._8}]{.fc2}k[]{._ ._3}eyword[ ]{._ ._9}[5]{.fc0}

</div>

<div class="t m0 x7 h7 yb ff1 fs2 fc1 sc0 ls0 ws0">

3[ ]{._ ._5}Comparing[ ]{._ ._8}objects[ ]{._ ._8}([ ]{._
._8}[compareT[]{._ ._a}o[ ]{._ ._8}[method)[ ]{._
._b}[7]{.fc0}]{.fc1}]{.fc2}

</div>

<div class="t m0 x9 h5 yc ff3 fs2 fc1 sc0 ls0 ws0">

3.1[ ]{._ ._c}[compareT[]{._ ._a}o[ ]{._ ._d}[in[ ]{._ ._d}action[ ]{._
._e}[.............................[ ]{._ ._f}[9]{.ls0}]{.fc0 .ls1}]{.ff3
.fc1}]{.ff2 .fc2}

</div>

<div class="t m0 x7 h7 yd ff1 fs2 fc1 sc0 ls0 ws0">

4[ ]{._ ._5}Multi-criteria[ ]{._ ._8}comparison[ ]{._ ._10}[12]{.fc0}

</div>

<div class="t m0 x7 h7 ye ff1 fs2 fc1 sc0 ls0 ws0">

5[ ]{._ ._5}Unit[ ]{._ ._8}testing[ ]{._ ._8}methods[ ]{._ ._8}of[ ]{._
._8}a[ ]{._ ._8}class[ ]{._ ._11}[14]{.fc0}

</div>

<div class="t m0 x7 h7 yf ff1 fs2 fc1 sc0 ls0 ws0">

6[ ]{._ ._5}JUnit[ ]{._ ._8}testing[ ]{._ ._12}[15]{.fc0}

</div>

<div class="t m0 xa h5 y10 ff3 fs2 fc1 sc0 ls0 ws0">

6.0.1[ ]{._ ._13}Corr[]{._ ._0}ected[ ]{._ ._2}version[ ]{._ ._8}by[
]{._ ._8}looking[ ]{._ ._2}at[ ]{._ ._8}JU[]{._ ._3}nit[ ]{._
._d}failure[ ]{._ ._2}[............[ ]{._ ._14}[16]{.ls0}]{.fc0 .ls1}

</div>

<div class="t m0 x7 h7 y11 ff1 fs2 fc1 sc0 ls0 ws0">

7[ ]{._ ._5}Static[ ]{._ ._8}members[ ]{._ ._8}vs.[ ]{._ ._d}Instance[
]{._ ._8}members[ ]{._ ._15}[17]{.fc0}

</div>

<div class="t m0 x9 h5 y12 ff3 fs2 fc1 sc0 ls0 ws0">

7.1[ ]{._ ._16}S[]{._ ._3}tatic[ ]{._ ._d}member[ ]{._ ._d}access[ ]{._
._17}[.............................[ ]{._ ._5}[17]{.ls0}]{.fc0 .ls1}

</div>

<div class="t m0 x9 h5 y13 ff3 fs2 fc1 sc0 ls0 ws0">

7.2[ ]{._ ._16}Instance[ ]{._ ._8}member[ ]{._ ._d}access[ ]{._
._18}[...........................[ ]{._ ._5}[18]{.ls0}]{.fc0 .ls1}

</div>

<div class="t m0 x9 h5 y14 ff3 fs2 fc1 sc0 ls0 ws0">

7.3[ ]{._ ._16}T[]{._ ._a}ypical[ ]{._ ._2}static[ ]{._ ._8}methods[
]{._ ._19}[............................[ ]{._ ._5}[19]{.ls0}]{.fc0 .ls1}

</div>

<div class="t m0 x7 h7 y15 ff1 fs2 fc1 sc0 ls0 ws0">

8[ ]{._ ._5}Manipulating[ ]{._ ._8}references[ ]{._ ._1a}[20]{.fc0}

</div>

<div class="t m0 x9 h5 y16 ff3 fs2 fc1 sc0 ls0 ws0">

8.1[ ]{._ ._16}Shallo[]{._ ._0}w[ ]{._ ._d}copy[ ]{._
._1b}[..................................[ ]{._ ._5}[20]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y17 ff3 fs2 fc1 sc0 ls0 ws0">

8.2[ ]{._ ._16}Deep[ ]{._ ._d}cop[]{._ ._3}y[ ]{._
._1c}[...................................[ ]{._ ._5}[21]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y18 ff3 fs2 fc1 sc0 ls0 ws0">

8.3[ ]{._ ._16}Cop[]{._ ._0}y[ ]{._ ._2}constructor[ ]{._
._1c}[...............................[ ]{._ ._5}[24]{.ls0}]{.fc0 .ls1}

</div>

<div class="t m0 xa h5 y19 ff3 fs2 fc1 sc0 ls0 ws0">

8.3.1[ ]{._ ._13}Cop[]{._ ._0}y[ ]{._ ._2}constructor[ ]{._ ._8}call[
]{._ ._1b}[.........................[ ]{._ ._5}[25]{.ls0}]{.fc0 .ls1}

</div>

<div class="t m0 x7 h7 y1a ff1 fs2 fc1 sc0 ls0 ws0">

9[ ]{._ ._5}Sample[ ]{._ ._8}solutions[ ]{._ ._8}for[ ]{._ ._8}e[]{._
._3}x[]{._ ._0}ercises[ ]{._ ._1d}[26]{.fc0}

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

2

</div>

[](#pf3){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:657.521000px;width:66.214000px;height:10.049000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf4){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:628.537000px;width:83.352000px;height:11.865000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf6){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:601.369000px;width:214.643000px;height:12.301000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf9){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:584.493000px;width:132.672000px;height:12.231000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfb){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:557.942000px;width:143.647000px;height:11.865000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfd){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:530.774000px;width:165.760000px;height:11.865000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfe){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:503.605000px;width:80.374000px;height:11.866000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf10){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:129.750000px;bottom:486.610000px;width:252.213000px;height:12.765000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf10){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:461.995000px;width:200.930000px;height:10.049000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf11){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:445.676000px;width:133.196000px;height:10.272000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf12){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:429.417000px;width:148.108000px;height:10.272000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf12){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:410.665000px;width:137.516000px;height:12.765000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf13){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:384.233000px;width:137.691000px;height:11.866000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf14){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:367.238000px;width:91.654000px;height:12.765000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf15){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:350.979000px;width:79.403000px;height:12.351000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf18){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:334.720000px;width:112.654000px;height:12.351000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf19){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:129.750000px;bottom:318.461000px;width:142.130000px;height:12.765000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf1a){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:88.295000px;bottom:292.029000px;width:164.134000px;height:11.866000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf3" class="pf w0 h0" data-page-no="3">

<div class="pc pc3 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAABfCAIAAABKnOD7AAAACXBIWXMAABYlAAAWJQFJUiTwAAABjUlEQVR42u3WsREAIAwDscD+47oPc5iTRvjqJ8kAAFBnd0UAAKhzbBwAQKMrAQCAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAICNAwCwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAgI0DALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwCAjQMAsHEAANg4AABsHADAt5KIAABQ5wFGnAxqL8vUgwAAAABJRU5ErkJggg==){.bi
.x7 .y7 .w2 .h6}
<div class="t m0 xb h3 y8 ff4 fs1 fc0 sc0 ls0 ws0">

L[]{._ ._3}ist[ ]{._ ._2}of[ ]{._ ._4}e[]{._ ._3}xer[]{._ ._3}cises

</div>

<div class="t m0 x9 h5 y1b ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}1[ ]{._
._c}[......................................[ ]{._ ._f}[6]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y1c ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}2[ ]{._
._c}[......................................[ ]{._ ._5}[10]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y1d ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}3[ ]{._
._c}[......................................[ ]{._ ._5}[13]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y1e ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}4[ ]{._
._c}[......................................[ ]{._ ._5}[18]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y1f ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}5[ ]{._
._c}[......................................[ ]{._ ._5}[21]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y20 ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}6[ ]{._
._c}[......................................[ ]{._ ._5}[23]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y21 ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}7[ ]{._
._c}[......................................[ ]{._ ._5}[24]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x9 h5 y22 ff3 fs2 fc1 sc0 ls0 ws0">

Exer[]{._ ._3}cise[ ]{._ ._d}8[ ]{._
._c}[......................................[ ]{._ ._5}[25]{.ls0}]{.fc0
.ls1}

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

3

</div>

[](#pf6){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:668.370000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfa){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:652.111000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfd){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:635.852000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf12){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:619.593000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf15){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:603.334000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf17){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:587.075000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf18){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:570.816000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf19){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:104.659000px;bottom:554.557000px;width:60.312000px;height:9.858000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf4" class="pf w0 h0" data-page-no="4">

<div class="pc pc4 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAABfCAIAAABKnOD7AAAACXBIWXMAABYlAAAWJQFJUiTwAAABjUlEQVR42u3WsREAIAwDscD+47oPc5iTRvjqJ8kAAFBnd0UAAKhzbBwAQKMrAQCAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAICNAwCwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAgI0DALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwCAjQMAsHEAANg4AABsHADAt5KIAABQ5wFGnAxqL8vUgwAAAABJRU5ErkJggg==){.bi
.x7 .y23 .w2 .h6}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}1.

</div>

<div class="t m0 xc h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

Overview

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

W[]{._ ._0}e[ ]{._ ._8}explore[ ]{._ ._d}classes[ ]{._ ._d}and[ ]{._
._2}objects[ ]{._ ._8}in[ ]{._ ._d}more[ ]{._ ._d}detail[ ]{._ ._d}on[
]{._ ._2}the[ ]{._ ._8}following[ ]{._ ._8}points:

</div>

<div class="t m0 x9 h5 y27 ff5 fs2 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[this[ ]{._ ._1e}]{.ff2 .fc2}[keyword]{.ff3}

</div>

<div class="t m0 x9 h5 y28 ff5 fs2 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[Comparing[ ]{._ ._8}objects]{.ff3}

</div>

<div class="t m0 x9 h5 y29 ff5 fs2 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[U[]{._ ._0}nit[ ]{._ ._d}testing[ ]{._ ._d}methods[ ]{._
._2}of[ ]{._ ._8}a[ ]{._ ._2}class]{.ff3}

</div>

<div class="t m0 x9 h5 y2a ff5 fs2 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[static[ ]{._ ._1e}]{.ff2 .fc2}[vs[ ]{._ ._d}instance[ ]{._
._d}members]{.ff3}

</div>

<div class="t m0 x9 h5 y2b ff5 fs2 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[Manipulating[ ]{._ ._8}refer[]{._ ._3}ences]{.ff3}

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

4

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf5" class="pf w0 h0" data-page-no="5">

<div class="pc pc5 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAAMJCAIAAAChoxGMAAAACXBIWXMAABYlAAAWJQFJUiTwAAAMDklEQVR42u3ZoW4FMQxFwbhaGOX/v3MVYxc8aUlV5gVpZ5BRwEVHyth7DwAAjlNVRgAAOE7IOACAE32ZAABAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgDgz9p7GwEA4DhRVVYAADiOT1UAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAC9rvYXM3POaVkAgDdU1eeI52oUEXXfVgYAaK6stZ5486kKAHAkGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg40wAACDjAACQcQAA/O5qfzEzxxixlnEBAN4TVWUFAIDj+FQFAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAA/Xe0vZuac07IAAG+oqs8Rz9UoIuq+rQwA0FxZaz3x5lMVAOBIMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxpkAAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwD4v672FzNzjBFrGRcA4D3fYZE7rkYe0XkAAAAASUVORK5CYII=){.bi
.x7 .y2c .w2 .h8}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}2.

</div>

<div class="t m0 xd h3 y25 ff4 fs1 fc2 sc0 ls0 ws0">

this[ ]{._ ._e}[keyword]{.fc0}

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

Consider[ ]{._ ._8}the[ ]{._ ._2}follo[]{._ ._0}wing[ ]{._ ._d}class[
]{._ ._2}deﬁnition,

</div>

<div class="t m0 xe h9 y2d ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Circle[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe h9 y2e ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._20}[private[ ]{._ ._1f}double[ ]{._ ._1f}[radius[;]{.fc0
.ls0}]{.ff7 .fc4}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe h9 y2f ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._20}[public[ ]{._ ._1f}[void[ ]{._
._1f}]{.ls3}[setRadius(]{.ff7 .fc0}double[ ]{._ ._1f}[radius[){]{.fc0
.ls4}]{.ff7 .fc4}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe ha y30 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._21}[radius[ ]{._ ._1f}[=[ ]{._ ._1f}]{.fc0
.ls0}[Math.abs(radius)[;]{.fc0 .ls0}]{.ls3}]{.ff7 .fs4 .fc4 .ls2}

</div>

<div class="t m0 xe ha y31 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._20}[}]{.ff7 .fs4}

</div>

<div class="t m0 xe ha y32 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._20}[//[assume[ ]{._ ._1f}getter[ ]{._ ._1f}]{.ls2}is[ ]{._
._1f}[also[ ]{._ ._1e}defined]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 xe ha y33 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 xf h5 y34 ff3 fs2 fc0 sc0 ls0 ws0">

Because[ ]{._ ._22}the[ ]{._ ._22}parameter[ ]{._ ._22}and[ ]{._
._22}instance[ ]{._ ._22}variable[ ]{._ ._22}have[ ]{._ ._8}the[ ]{._
._22}same[ ]{._ ._22}name[ ]{._ ._22}([ ]{._ ._8}[radius[ ]{._
._22}]{.ff2 .fc2}),[ ]{._ ._8}it[ ]{._ ._22}is[ ]{._ ._22}not

</div>

<div class="t m0 x7 h5 y35 ff3 fs2 fc0 sc0 ls0 ws0">

clear[ ]{._ ._d}which[ ]{._ ._d}one[ ]{._ ._2}is[ ]{._
._8}a[ﬀ]{.ff8}ected[ ]{._ ._d}in[ ]{._ ._2}the[ ]{._ ._8}assignment[
]{._ ._2}statement[ ]{._ ._8}on[ ]{._ ._d}line[ ]{._ ._2}4[ ]{._
._8}above[]{._ ._0}.

</div>

<div class="t m0 xf h5 y36 ff3 fs2 fc0 sc0 ls0 ws0">

J[]{._ ._0}ava[ ]{._ ._d}provides[ ]{._ ._8}a[ ]{._ ._2}keywor[]{._
._0}d[ ]{._ ._1b}[this[ ]{._ ._1e}]{.ff2 .fc2}that[ ]{._ ._2}r[]{._
._0}efers[ ]{._ ._2}to[ ]{._ ._8}the[ ]{._ ._2}calling[ ]{._ ._8}object[
]{._ ._2}and[ ]{._ ._8}gives[ ]{._ ._2}access[ ]{._ ._8}to[ ]{._ ._2}its

</div>

<div class="t m0 x7 h5 y37 ff3 fs2 fc0 sc0 ls0 ws0">

instance[ ]{._ ._2}variables[ ]{._ ._2}and[ ]{._ ._d}methods.[ ]{._
._23}Line[ ]{._ ._2}4[ ]{._ ._d}now[ ]{._ ._2}sho[]{._ ._0}ws[ ]{._
._2}that[ ]{._ ._2}the[ ]{._ ._d}instance[ ]{._ ._2}variable[ ]{._
._17}[radius]{.ff2 .fc2}

</div>

<div class="t m0 xe hb y38 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._17}class[ ]{._ ._17}[Circle[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y39 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._24}[private[ ]{._ ._17}double[ ]{._ ._17}[radius[;]{.fc0
.ls0}]{.ff7}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y3a ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._24}[public[ ]{._ ._17}[void[ ]{._
._17}]{.ls6}[setRadius(]{.ff7 .fc0}double[ ]{._ ._17}[radius)[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y3b ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._25}[this[.radius[ ]{._ ._17}=[ ]{._ ._17}Math.abs(radius)[]{._
._26};]{.ff7 .fc0 .ls7}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y3c ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._24}[}]{.ff7 .fs5}

</div>

<div class="t m0 xe hc y3d ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[//[assume[ ]{._ ._17}getter[ ]{._ ._17}]{.ls5}is[ ]{._
._17}[also[ ]{._ ._17}defined]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hc y3e ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 x7 h5 y3f ff3 fs2 fc0 sc0 ls0 ws0">

on[ ]{._ ._2}line[ ]{._ ._d}2[ ]{._ ._2}will[ ]{._ ._d}be[ ]{._
._2}a[ﬀ]{.ff8}ected[ ]{._ ._d}by[ ]{._ ._d}the[ ]{._ ._2}assignment[
]{._ ._d}statement.[ ]{._ ._23}As[ ]{._ ._2}you[ ]{._ ._d}can[ ]{._
._2}see[]{._ ._0},[ ]{._ ._2}the[ ]{._ ._1b}[Math.abs]{.ff2 .fc2}

</div>

<div class="t m0 x7 h5 y40 ff3 fs2 fc0 sc0 ls0 ws0">

method[ ]{._ ._d}is[ ]{._ ._d}using[ ]{._ ._2}the[ ]{._ ._8}parameter[
]{._ ._d}variable[ ]{._ ._1e}[radius[ ]{._ ._2}]{.ff2 .fc2}.

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

5

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf6" class="pf w0 h0" data-page-no="6">

<div class="pc pc6 w0 h0">

![](data:image/png;base64,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){.bi
.xf .y41 .w2 .hd}
<div class="t m0 x10 he y42 ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}1

</div>

<div class="t m0 x11 he y43 ff9 fs1 fc5 sc0 ls0 ws0">

Disambiguate[ ]{._ ._18}assignment[ ]{._ ._28}operation

</div>

<div class="t m0 x12 hf y44 ffa fs1 fc0 sc0 ls8 ws0">

Get[ ]{._ ._18}rid[ ]{._ ._18}of[ ]{._ ._18}the[ ]{._ ._18}ambiguity[
]{._ ._18}in[ ]{._ ._18}the[ ]{._ ._29}[setSide[ ]{._ ._29}]{.ff9 .fc2
.ls0}method

</div>

<div class="t m0 x13 h9 y45 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Square[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y46 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._20}[private[ ]{._ ._1f}double[ ]{._ ._1f}[side;]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y47 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._20}[public[ ]{._ ._1f}[void[ ]{._ ._1f}]{.ls3}[setSide(]{.ff7
.fc0}double[ ]{._ ._1f}[side)[ ]{._ ._1e}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3
.ls2}

</div>

<div class="t m0 x13 ha y48 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._21}[side[ ]{._ ._1f}=[ ]{._ ._1f}Math.max(0,[ ]{._
._1e}side);]{.ff7 .fs4 .ls2}

</div>

<div class="t m0 x13 ha y49 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._20}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 ha y4a ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._20}[//[assume[ ]{._ ._1f}getter[ ]{._ ._1f}]{.ls2}is[ ]{._
._1f}[also[ ]{._ ._1e}defined]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y4b ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y4c ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._18}here

</div>

<div class="t m0 x12 hf y4d ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[1]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

6

</div>

[](#pf1a){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:473.902000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf7" class="pf w0 h0" data-page-no="7">

<div class="pc pc7 w0 h0">

![](data:image/png;base64,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){.bi
.x7 .y4e .w2 .h10}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}3.

</div>

<div class="t m0 x14 h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

Comparing[ ]{._ ._2}objects[ ]{._ ._4}([ ]{._ ._2}[compar[]{._
._0}eT[]{._ ._a}o[ ]{._ ._2a}[method)]{.fc0}]{.fc2}

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

The[ ]{._ ._d}method[ ]{._ ._1e}[compareT[]{._ ._a}o[ ]{._
._1e}[provides[ ]{._ ._8}a[ ]{._ ._d}way[ ]{._ ._2}to[ ]{._ ._8}deﬁne[
]{._ ._d}an[ ]{._ ._2}or[]{._ ._0}der[ ]{._ ._2}on[ ]{._ ._8}two[ ]{._
._2}objects[ ]{._ ._8}(say[ ]{._ ._d}[a[ ]{._ ._4}]{.ffb .fs7}and]{.ff3
.fc0}]{.ff2 .fc2}

</div>

<div class="t m0 x7 h5 y4f ffb fs7 fc0 sc0 ls0 ws0">

b[ ]{._ ._2b}[).[ ]{._ ._17}The[ ]{._ ._4}method[ ]{._ ._4}is[ ]{._
._4}called[ ]{._ ._4}on[ ]{._ ._4}object[ ]{._ ._4}]{.ff3 .fs2}a[ ]{._
._1}[and[ ]{._ ._4}the[ ]{._ ._4}object[ ]{._ ._4}]{.ff3 .fs2}b[ ]{._
._1}[is[ ]{._ ._4}passed[ ]{._ ._4}as[ ]{._ ._4}a[ ]{._
._4}parameter[]{._ ._0},[ ]{._ ._4}the]{.ff3 .fs2}

</div>

<div class="t m0 x7 h5 y50 ff3 fs2 fc0 sc0 ls0 ws0">

result[ ]{._ ._8}indicating[ ]{._ ._d}how[ ]{._ ._8}[a[ ]{._ ._4}]{.ffb
.fs7}compares[ ]{._ ._d}to[ ]{._ ._8}[b[ ]{._ ._2b}]{.ffb .fs7}.

</div>

<div class="t m0 x15 h11 y51 ffc fs6 fc4 sc0 ls0 ws0">

v[ ]{._ ._2}[NO[]{._ ._0}TE[ ]{._ ._1}[w]{.ffc}]{.ffd}

</div>

<div class="t m0 x9 h12 y52 ff3 fs6 fc0 sc0 ls0 ws0">

Y[]{._ ._a}ou[ ]{._ ._2}can[ ]{._ ._d}access[ ]{._ ._17}[private[ ]{._
._1b}]{.ff2 .fc2}instance[ ]{._ ._2}members[ ]{._ ._2}of[ ]{._ ._d}the[
]{._ ._2}object[ ]{._ ._2}passed[ ]{._ ._2}inside[ ]{._ ._d}a

</div>

<div class="t m0 x9 h12 y53 ff3 fs6 fc0 sc0 ls0 ws0">

method[ ]{._ ._2}dir[]{._ ._0}ectly[]{._ ._0},[ ]{._ ._d}as[ ]{._
._2}long[ ]{._ ._d}as[ ]{._ ._2}the[ ]{._ ._2}object[ ]{._ ._2}is[ ]{._
._d}of[ ]{._ ._2}the[ ]{._ ._2}same[ ]{._ ._d}class[ ]{._ ._2}as[ ]{._
._2}the[ ]{._ ._d}one[ ]{._ ._2}the

</div>

<div class="t m0 x16 h12 y54 ff3 fs6 fc0 sc0 ls0 ws0">

method[ ]{._ ._2}is[ ]{._ ._d}in.

</div>

<div class="t m0 xf h5 y55 ff3 fs2 fc0 sc0 ls0 ws0">

Consider[ ]{._ ._8}the[ ]{._ ._2}follo[]{._ ._0}wing[ ]{._ ._d}method[
]{._ ._2}in[ ]{._ ._8}the[ ]{._ ._1e}[Circle[ ]{._ ._1e}]{.ff2
.fc2}class,

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

7

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf8" class="pf w0 h0" data-page-no="8">

<div class="pc pc8 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyQAAAHNCAIAAABgvCgwAAAACXBIWXMAABYlAAAWJQFJUiTwAAAG4ElEQVR42u3WMQ0AMQwEwTgAwh9ndL0fw0txNwNhq11JFgAAM6q7q6rv1QIA4PFpnbNVAACYY7YAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsSAACYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWxIAAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAAPgviQgAAEM+LGsPTnkTaS8AAAAASUVORK5CYII=){.bi
.x17 .y56 .w3 .h13}
<div class="t m0 xe h14 y57 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._2c}[public[ ]{._ ._e}[class[ ]{._ ._2d}]{.lsa}]{.ff6 .fs4 .fc3
.ls9}[Circle[ ]{._ ._2d}{]{.fs8 .lsb}

</div>

<div class="t m0 xe ha y58 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._25}[//[ ]{._ ._e}[other[ ]{._ ._e}[methods[ ]{._ ._e}[and[
]{._ ._e}[instance[ ]{._ ._e}]{.ls10}]{.lsf}members]{.lse}]{.lsd}]{.ff7
.fs4 .fc2 .lsc}

</div>

<div class="t m0 xe h15 y59 ff3 fs3 fc0 sc0 ls0 ws0">

3

</div>

<div class="t m0 xe ha y5a ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._25}[/]{.ff7 .fs4 .fc2}

</div>

<div class="t m0 x18 ha y5b ff7 fs4 fc2 sc0 ls0 ws0">

\*

</div>

<div class="t m0 xe ha y5c ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._25}[comparison[ ]{._ ._e}[criterion [:[ ]{._ ._2a}[radius[]{._
._26}]{.ls9}.]{.ls0}]{.ls12}]{.ff7 .fs4 .fc2 .ls11}

</div>

<div class="t m0 xe ha y5d ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._25}[return[ ]{._ ._17}[1[ ]{._ ._2a}[if[ ]{._ ._e}[the[ ]{._
._2a}[calling[ ]{._ ._e}]{.lse}]{.lsf}]{.lsc}]{.ls0}object[ ]{._
._e}[is[ ]{._ ._e}[\`\`[]{._ ._26}more [''[ ]{._ ._17}]{.ls14}than[ ]{._
._2a}[other]{.lsd}]{.ls13}]{.lsc}]{.ff7 .fs4 .fc2 .ls9}

</div>

<div class="t m0 xe ha y5e ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._25}[-1[ ]{._ ._e}[if[ ]{._ ._e}[its[ ]{._ ._e}[\`\`[]{._
._26}less '']{.ls13}]{.lsf}]{.lsc}]{.ff7 .fs4 .fc2 .ls15}

</div>

<div class="t m0 xe ha y5f ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._2e}[0[ ]{._ ._2a}[if[ ]{._ ._e}[they[ ]{._ ._e}[are[ ]{._
._e}]{.lsf}\`\` [equal ]{.lsa}'']{.ls13}]{.lsc}]{.ff7 .fs4 .fc2}

</div>

<div class="t m0 xe h15 y60 ff3 fs3 fc0 sc0 ls0 ws0">

9

</div>

<div class="t m0 x18 ha y61 ff7 fs4 fc2 sc0 ls0 ws0">

\*

</div>

<div class="t m0 x19 ha y60 ff7 fs4 fc2 sc0 ls0 ws0">

/

</div>

<div class="t m0 x7 h14 y62 ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._25}[public[ ]{._ ._e}[int[ ]{._ ._17}]{.lsf}]{.ff6 .fs4 .fc3
.ls9}[compareTo[]{._ ._2b}([ ]{._ ._8}C[ ]{._ ._2b}i[ ]{._ ._2f}r[]{._
._2b}c[ ]{._ ._2b}l[ ]{._ ._2f}e[ ]{._ ._18}o[]{._ ._30}t[]{._
._30}h[]{._ ._2b}e[]{._ ._30}r[ ]{._ ._22})[ ]{._ ._18}{]{.fs8 .ls16}

</div>

<div class="t m0 x7 h14 y63 ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._31}[if[ ]{._ ._2b}]{.ff6 .fs4 .fc3 .lsc}[([ ]{._ ._22}[this[
]{._ ._2f}]{.ff6 .fs4 .fc3 .ls13}[.r[]{._ ._a}a[]{._ ._32}d[]{._
._32}i[]{._ ._a}u[]{._ ._32}s[ ]{._ ._1}&gt;[ ]{._ ._1}o[]{._
._32}t[]{._ ._32}h[]{._ ._32}e[]{._ ._32}r.r[]{._ ._32}a[]{._
._32}d[]{._ ._a}i[]{._ ._32}u[]{._ ._32}s)]{.ls17}]{.fs8}

</div>

<div class="t m0 x7 h14 y64 ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._33}[return[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .ls9}[1;]{.fs8 .lsb}

</div>

<div class="t m0 x7 h14 y65 ff3 fs3 fc0 sc0 ls0 ws0">

13[ ]{._ ._31}[if[ ]{._ ._2b}]{.ff6 .fs4 .fc3 .lsc}[([ ]{._ ._22}[this[
]{._ ._2f}]{.ff6 .fs4 .fc3 .ls13}[.r[]{._ ._a}a[]{._ ._32}d[]{._
._32}i[]{._ ._a}u[]{._ ._32}s[ ]{._ ._1}&lt;[ ]{._ ._1}o[]{._
._32}t[]{._ ._32}h[]{._ ._32}e[]{._ ._32}r.r[]{._ ._32}a[]{._
._32}d[]{._ ._a}i[]{._ ._32}u[]{._ ._32}s)]{.ls17}]{.fs8}

</div>

<div class="t m0 x7 h14 y66 ff3 fs3 fc0 sc0 ls0 ws0">

14[ ]{._ ._34}[return[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .ls9}[[]{._
._30}[1;]{.ff3 .ls18}]{.ffc .fs8}

</div>

<div class="t m0 x7 h14 y67 ff3 fs3 fc0 sc0 ls0 ws0">

15[ ]{._ ._31}[return[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .ls9}[0;]{.fs8 .lsb}

</div>

<div class="t m0 x7 h14 y68 ff3 fs3 fc0 sc0 ls0 ws0">

16[ ]{._ ._35}[}]{.fs8}

</div>

<div class="t m0 x7 h14 y69 ff3 fs3 fc0 sc0 ls0 ws0">

17[ ]{._ ._36}[}]{.fs8}

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

8

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf9" class="pf w0 h0" data-page-no="9">

<div class="pc pc9 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyQAAAEvCAIAAAA7MJK5AAAACXBIWXMAABYlAAAWJQFJUiTwAAAElUlEQVR42u3WMREAMQwEsTgAwh9n5no/ifekkSBstSvJAgBgRnV3VfW9WgAA/Hxa52wVAADmmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzJYEAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAACzBQCA2QIAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMFgAAZgsAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAACzBQBgtgAAzBYAAGYLAMBsAQCYLQAAzBYAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgAwWwAAmC0AALMFAGC2AAAwWwAAZgsAwGwBAGC2AADMFgCA2QIAwGwBAJgtAADMFgCA2QIAMFsAAJgtAACzBQBgtgAAMFsAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAACYLQAAswUAYLYAADBbAABmCwDAbAEAYLYAAMwWAIDZAgDAbAEAmC0AALMFAIDZAgAwWwAAZgsAALMFAGC2AADMlgQAAGYLAMBsAQBgtgAAzBYAgNkCAMBsAQCYLQAAswUAgNkCADBbAABmCwAAswUAYLYAAMwWAABmCwDAbAEAmC0AAMwWAIDZAgDAbAEAmC0AALMFAIDZAgB4JYkIAABDPl82DhKO2bOjAAAAAElFTkSuQmCC){.bi
.x17 .y6a .w3 .h16}
<div class="t m0 x7 h17 y6b ff1 fs6 fc0 sc0 ls0 ws0">

3.1[ ]{._ ._27}[compareT[]{._ ._32}o[ ]{._ ._1e}[in[ ]{._
._8}action]{.fc0}]{.fc2}

</div>

<div class="t m0 xe h14 y6c ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._36}[Circle[ ]{._ ._e}m[]{._ ._3}y[]{._ ._0}C[]{._ ._0}i[]{._
._0}r[]{._ ._3}c[]{._ ._0}l[]{._ ._0}e[ ]{._ ._1b}=[ ]{._ ._1e}[new[
]{._ ._2d}]{.ff6 .fs4 .fc3 .lsf}Circle (12) ;]{.fs8 .lsb}

</div>

<div class="t m0 xe h14 y6d ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._36}[Circle[ ]{._ ._2a}you[]{._ ._3}rC[]{._ ._0}irc[]{._
._0}le[ ]{._ ._17}=[ ]{._ ._1f}[new[ ]{._ ._2d}]{.ff6 .fs4 .fc3
.lsf}Circle (18) ;]{.fs8 .lsb}

</div>

<div class="t m0 xe h14 y6e ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._36}[Circle[ ]{._ ._2a}ourC[]{._ ._0}irc[]{._ ._3}le[ ]{._
._1b}=[ ]{._ ._1e}[new[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .lsf}Circle (7[]{._
._26})[ ]{._ ._2f};]{.fs8 .lsb}

</div>

<div class="t m0 xe h14 y6f ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._36}[Circle[ ]{._ ._2d}t[]{._ ._26}he[]{._ ._26}ir[]{._
._26}Ci[]{._ ._26}rc[]{._ ._26}le[ ]{._ ._e}=[ ]{._ ._1e}[new[ ]{._
._2d}]{.ff6 .fs4 .fc3 .lsf}Circle ([]{._ ._3}12) ;]{.fs8 .lsb}

</div>

<div class="t m0 xe h15 y70 ff3 fs3 fc0 sc0 ls0 ws0">

5

</div>

<div class="t m0 xe h14 y71 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[int[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsf}[s1[ ]{._ ._17}=[
]{._ ._17}myCircle[ ]{._ ._22}. c[]{._ ._0}o[]{._ ._0}m[]{._ ._0}p[]{._
._0}a[]{._ ._0}r[]{._ ._0}e[]{._ ._3}T[]{._ ._0}o ([ ]{._ ._2f}y[]{._
._26}o[]{._ ._26}u rC[]{._ ._26}i rc le[ ]{._ ._2f})[ ]{._ ._8};[ ]{._
._2d}[//[]{._ ._2b}[-1]{.ls15}]{.ff7 .fs4 .fc2 .lsc}]{.fs8 .ls19}

</div>

<div class="t m0 xe h14 y72 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._24}[int[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsf}[s2[ ]{._ ._17}=[
]{._ ._17}myCircle[ ]{._ ._22}. c[]{._ ._0}o[]{._ ._0}m[]{._ ._0}p[]{._
._0}a[]{._ ._0}r[]{._ ._0}e[]{._ ._3}T[]{._ ._0}o ([ ]{._ ._2f}o[]{._
._26}u[]{._ ._26}r Ci rc le[ ]{._ ._22})[ ]{._ ._22};[ ]{._ ._2d}[//
[1]{.ls0}]{.ff7 .fs4 .fc2 .lsc}]{.fs8 .ls19}

</div>

<div class="t m0 xe h14 y73 ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._24}[int[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsf}[s3[ ]{._ ._17}=[
]{._ ._17}myCircle[ ]{._ ._22}. c[]{._ ._0}o[]{._ ._0}m[]{._ ._0}p[]{._
._0}a[]{._ ._0}r[]{._ ._0}e[]{._ ._3}T[]{._ ._0}o ([ ]{._ ._37}t h e i
r[]{._ ._26}C i r c l e[ ]{._ ._37})[ ]{._ ._22};[ ]{._ ._2d}[//
[0]{.ls0}]{.ff7 .fs4 .fc2 .lsc}]{.fs8 .ls19}

</div>

<div class="t m0 xe h14 y74 ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._24}[int[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsf}[s4[ ]{._ ._17}=[
]{._ ._e}t h e i r C i r[]{._ ._26}c l e[ ]{._ ._8}.[]{._ ._2b}c[]{._
._0}o[]{._ ._0}m[]{._ ._0}p[]{._ ._0}a[]{._ ._0}r[]{._ ._0}e[]{._
._3}T[]{._ ._0}o ([ ]{._ ._2f}o[]{._ ._26}u rC ir cl e[ ]{._ ._2f})[
]{._ ._22};[ ]{._ ._2d}[//[ ]{._ ._e}??]{.ff7 .fs4 .fc2 .lsc}]{.fs8
.ls19}

</div>

<div class="t m0 x7 h14 y75 ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._24}[int[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsf}[s5[ ]{._ ._17}=[
]{._ ._e}ou rC ir cl e[ ]{._ ._37}.[]{._ ._2b}c[]{._ ._0}o[]{._
._0}m[]{._ ._0}p[]{._ ._3}a[]{._ ._0}r[]{._ ._0}e[]{._ ._0}T[]{._ ._0}o
([ ]{._ ._2f}y[]{._ ._26}o ur Ci[]{._ ._26}r cl e[ ]{._ ._2b})[ ]{._
._8};[ ]{._ ._2d}[//[ ]{._ ._e}??]{.ff7 .fs4 .fc2 .lsc}]{.fs8 .ls19}

</div>

<div class="t m0 x7 h14 y76 ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._24}[int[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsf}[s6[ ]{._ ._17}=[
]{._ ._e}yo ur Ci rc[]{._ ._26}l e[ ]{._ ._37}.[]{._ ._2b}c[]{._
._0}o[]{._ ._0}m[]{._ ._0}p[]{._ ._0}a[]{._ ._0}r[]{._ ._0}e[]{._
._3}T[]{._ ._0}o ([ ]{._ ._2f}y[]{._ ._26}o[]{._ ._26}u rC[]{._ ._26}i
rc le[ ]{._ ._2f})[ ]{._ ._8};[ ]{._ ._2d}[//[ ]{._ ._e}??]{.ff7 .fs4
.fc2 .lsc}]{.fs8 .ls19}

</div>

<div class="t m0 x6 h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

9

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pfa" class="pf w0 h0" data-page-no="a">

<div class="pc pca w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAATeCAIAAABrPwOVAAAACXBIWXMAABYlAAAWJQFJUiTwAAAYfklEQVR42u3dQWhcdR7A8ffeRIy1TodBqWRKxJgaSGMrhEUs6CXV3VNsExEP6xKRvRSa3UOphXocEMReLL0I4qKHQmhtbVCCdLAI1vYw0IOZS9MEU2YoBEoygyVdmrw9vDK2hb2sYfLe+vmc3psWXvj95/Dl/2bmhXEcB/dZW1tbWlqanZ2t1WorKysBAACb6uWXX3722Wd7enq6u7vvfz28P+OuXLny0Ucf3bp1y7wAANJmcnJydHQ0l8s9kHFra2sffvhhpVIxIACA1Orr6zt+/HihUPgt48rlcrvhoijqH+wfnxgfGh4yLACATbR4fXH61PTl7y+vr6+3S+7TTz/N5XJhHMdXrlw5evRoEnAjoyP739lfKBZMDQAgPU5/fvrC1xdaK60gCCYnJw8cOBDevXv3rbfeSj4P99r+1yb+MWFMAAApdKly6WT5ZHJ89uzZaGlpqf2dhv3v7DcgAIB02juy99HuR5PjarUazc7OJifPDz3vXioAQJq9+pdXk4NarRbVarXkZHxi3GgAANKsfe/06tWrUfs3fn0vFQAg5dr3Tufn5yPjAADIIhkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwDg9+syAki/ntdLhkDnNb6rGwKkmd04AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4A4A/E78ZBhvlZLzaEHyaEjLIbBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMA4PfrMgLIrp7XS4YA8IdlNw4AQMYBACDjAACQcQAAMg4AABkHAICMAwD4A/G7cZABje/qhgDAQ+zGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4IwAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyzggAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEA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){.bi
.xf .y77 .w2 .h18}
<div class="t m0 x10 he y42 ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}2

</div>

<div class="t m0 x1a he y43 ff9 fs1 fc5 sc0 ls0 ws0">

Implement[ ]{._ ._38}[compareTo[ ]{._ ._38}]{.fc2}method

</div>

<div class="t m0 x12 hf y44 ffa fs1 fc0 sc0 ls8 ws0">

Add[ ]{._ ._18}a[ ]{._ ._29}[compareTo[ ]{._ ._29}]{.ff9 .fc2
.ls0}method[ ]{._ ._18}in[ ]{._ ._18}class[ ]{._ ._18}Square[ ]{._
._18}that

</div>

<div class="t m0 x12 hf y78 ffa fs1 fc0 sc0 ls8 ws0">

returns,

</div>

<div class="t m0 xa hf y79 ffe fs1 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[1i[]{._ ._39}fc[]{._ ._39}a[]{._ ._39}l[]{._ ._3a}l[]{._
._39}i[]{._ ._39}n[]{._ ._3a}go[]{._ ._39}b[]{._ ._39}j[]{._ ._3a}e[]{._
._39}c[]{._ ._39}t[]{._ ._3a}’[]{._ ._39}sa[]{._ ._39}r[]{._ ._3a}e[]{._
._39}ai[]{._ ._39}sm[]{._ ._3a}o[]{._ ._39}r[]{._ ._39}et[]{._
._3a}h[]{._ ._39}a[]{._ ._3a}n]{.ffa .ls1a}

</div>

<div class="t m0 x1b hf y7a ffa fs1 fc0 sc0 ls8 ws0">

parameter[ ]{._ ._18}object’s[ ]{._ ._18}area

</div>

<div class="t m0 xa hf y7b ffe fs1 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[-1[ ]{._ ._18}if[ ]{._ ._18}calling[ ]{._ ._18}object’s[
]{._ ._18}area[ ]{._ ._18}is[ ]{._ ._18}less[ ]{._ ._18}than]{.ffa .ls8}

</div>

<div class="t m0 x1b hf y7c ffa fs1 fc0 sc0 ls8 ws0">

parameter[ ]{._ ._18}object’s[ ]{._ ._18}area

</div>

<div class="t m0 xa hf y7d ffe fs1 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[0i[]{._ ._39}fc[]{._ ._39}a[]{._ ._39}l[]{._ ._3a}l[]{._
._39}i[]{._ ._39}n[]{._ ._3a}go[]{._ ._39}b[]{._ ._39}j[]{._ ._3a}e[]{._
._39}c[]{._ ._39}t[]{._ ._3a}’[]{._ ._39}sa[]{._ ._39}r[]{._ ._3a}e[]{._
._39}ai[]{._ ._39}se[]{._ ._3a}q[]{._ ._39}u[]{._ ._39}a[]{._
._3a}lt[]{._ ._39}op[]{._ ._39}a[]{._ ._3a}r[]{._ ._39}a[]{._
._3a}m[]{._ ._39}e[]{._ ._39}t[]{._ ._3a}e[]{._ ._39}r]{.ffa .ls1a}

</div>

<div class="t m0 x1b hf y7e ffa fs1 fc0 sc0 ls8 ws0">

object’s[ ]{._ ._18}area

</div>

<div class="t m0 x13 h9 y7f ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Square[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y80 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._20}[private[ ]{._ ._1f}double[ ]{._ ._1f}[side;]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y81 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._20}[//[assume[ ]{._ ._1f}getter[ ]{._ ._1f}and[ ]{._
._1f}set[]{._ ._26}ter]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 h9 y82 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._20}[public[ ]{._ ._1f}double[ ]{._ ._1f}[area()[ ]{._
._1e}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y83 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._21}[return[ ]{._ ._1f}[side]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x1c ha y84 ff7 fs4 fc0 sc0 ls0 ws0">

\*

</div>

<div class="t m0 x1d ha y83 ff7 fs4 fc0 sc0 ls2 ws0">

side;

</div>

<div class="t m0 x13 ha y85 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._20}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 ha y86 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y87 ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._18}here

</div>

<div class="t m0 x12 hf y88 ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[2]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

10

</div>

[](#pf1a){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:259.905000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pfb" class="pf w0 h0" data-page-no="b">

<div class="pc pcb w0 h0">

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

11

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pfc" class="pf w0 h0" data-page-no="c">

<div class="pc pcc w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAABfCAIAAABKnOD7AAAACXBIWXMAABYlAAAWJQFJUiTwAAABjUlEQVR42u3WsREAIAwDscD+47oPc5iTRvjqJ8kAAFBnd0UAAKhzbBwAQKMrAQCAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAICNAwCwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAgI0DALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwCAjQMAsHEAANg4AABsHADAt5KIAABQ5wFGnAxqL8vUgwAAAABJRU5ErkJggg==){.bi
.x7 .y23 .w2 .h6}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}4.

</div>

<div class="t m0 x1f h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

M[]{._ ._0}ulti-criteria[ ]{._ ._4}comparison

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

What[ ]{._ ._2}happens[ ]{._ ._2}if[ ]{._ ._4}ther[]{._ ._0}e[ ]{._
._4}ar[]{._ ._0}e[ ]{._ ._4}multiple[ ]{._ ._2}levels[ ]{._ ._2}of[ ]{._
._2}comparison[ ]{._ ._4}criteria?[ ]{._ ._1f}F[]{._ ._0}or[ ]{._
._2}example,[ ]{._ ._2}if[ ]{._ ._4}w[]{._ ._3}e

</div>

<div class="t m0 x7 h5 y4f ff3 fs2 fc0 sc0 ls0 ws0">

compare[ ]{._ ._22}two[ ]{._ ._8}rectangles[ ]{._ ._22}based[ ]{._
._8}on[ ]{._ ._8}area,[ ]{._ ._8}but[ ]{._ ._8}they[ ]{._ ._8}have[ ]{._
._8}the[ ]{._ ._8}same[ ]{._ ._8}area,[ ]{._ ._22}we[ ]{._ ._8}then[
]{._ ._8}compare

</div>

<div class="t m0 x7 h5 y50 ff3 fs2 fc0 sc0 ls0 ws0">

them[ ]{._ ._d}on[ ]{._ ._d}per[]{._ ._26}imeter[]{._ ._0},[ ]{._
._d}and[ ]{._ ._d}if[ ]{._ ._d}even[ ]{._ ._d}that’[]{._ ._a}s[ ]{._
._d}the[ ]{._ ._d}same,[ ]{._ ._8}return[ ]{._ ._d}0.

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

12

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pfd" class="pf w0 h0" data-page-no="d">

<div class="pc pcd w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAAXgCAIAAADzOG78AAAACXBIWXMAABYlAAAWJQFJUiTwAAAcbElEQVR42u3db2gUdx7A4dnZFNNoN0tQFFcEt0ZoNkIhFLFgOdj+uVc5xVIKpUWh99LcvWhLXwT6JtCi+Er0hR4UrohtsZpDDqRpaBFqDXTbUjSgRo9s3aBYljW5yuZonHsxssZej+OobGba53k1v40y4Tt58eE3s7uZKIqCRRYWFm7evHnhwoUvvvgiAABgqW3dunXDhg1r167t7Oxc/HpmccZNTEzs3bu3Xq+bFwBA0gwNDQ0ODmaz2fsybmFh4e233x4fHzcgAIDEKhaL+/fvz+fz9zJuZGSk1XBhGG7s27hz187+gX7DAgBYQtUr1VPHTp379NydO3daJXf48OFsNpuJomhiYuLNN9+MA648WN7+8vZ8T97UAACS4/i7xz/52ydzt+aCINi9e/crr7yS+fHHH1944YX4ebhntj+z60+7jAkAIIHOjp89OHIwPj558mR48+bN1nsatr+83YAAAJLpyfKTyzqXxceVSiW8cOFCvNjUv8m9VACAJHvq90/FB5OTk+Hk5GS82Llrp9EAACRZ697pN998E966dSteeF8qAEDCte6dXr16NTQOAIA0knEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AAB+uQ4jgORb+2zBEGi/mY9rhgBJZjcOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMA+A3xuXGQYj7WiwfCBxNCStmNAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEA8Mt1GAGk19pnC4YA8JtlNw4AQMYBACDjAACQcQAAMg4AABkHAICMAwD4DfG5cZACMx/XDAGAn7AbBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjjAAAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOCMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMs4IAABkHAAAMg4AABkHACDjAACQcQAAyDgA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){.bi
.xf .y89 .w2 .h19}
<div class="t m0 x10 he y42 ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}3

</div>

<div class="t m0 x20 he y43 ff9 fs1 fc5 sc0 ls0 ws0">

Implement[ ]{._ ._18}multi-criteria[ ]{._ ._28}[compareTo[ ]{._
._38}]{.fc2}method

</div>

<div class="t m0 x12 hf y44 ffa fs1 fc0 sc0 ls8 ws0">

Add[ ]{._ ._18}a[ ]{._ ._29}[compareTo[ ]{._ ._29}]{.ff9 .fc2
.ls0}method[ ]{._ ._18}in[ ]{._ ._18}class[ ]{._ ._29}[Rectangle[ ]{._
._38}]{.ff9 .fc2 .ls0}that

</div>

<div class="t m0 x12 hf y78 ffa fs1 fc0 sc0 ls8 ws0">

returns,

</div>

<div class="t m0 xa hf y79 ffe fs1 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[1i[]{._ ._39}fc[]{._ ._39}a[]{._ ._39}l[]{._ ._3a}l[]{._
._39}i[]{._ ._39}n[]{._ ._3a}go[]{._ ._39}b[]{._ ._39}j[]{._ ._3a}e[]{._
._39}c[]{._ ._39}t[]{._ ._3a}’[]{._ ._39}sa[]{._ ._39}r[]{._ ._3a}e[]{._
._39}ai[]{._ ._39}sm[]{._ ._3a}o[]{._ ._39}r[]{._ ._39}et[]{._
._3a}h[]{._ ._39}a[]{._ ._3a}n]{.ffa .ls1a}

</div>

<div class="t m0 x1b hf y7a ffa fs1 fc0 sc0 ls8 ws0">

parameter[ ]{._ ._18}object’s[ ]{._ ._18}area,[ ]{._ ._18}or[ ]{._
._18}if[ ]{._ ._18}they[ ]{._ ._18}have[ ]{._ ._18}the

</div>

<div class="t m0 x1b hf y8a ffa fs1 fc0 sc0 ls8 ws0">

same[ ]{._ ._18}area,[ ]{._ ._18}but[ ]{._ ._18}calling[ ]{._
._18}object’s[ ]{._ ._18}perimeter[ ]{._ ._18}is

</div>

<div class="t m0 x1b hf y8b ffa fs1 fc0 sc0 ls8 ws0">

more[ ]{._ ._18}than[ ]{._ ._18}parameter[ ]{._ ._18}object’s[ ]{._
._18}perimeter.

</div>

<div class="t m0 xa hf y8c ffe fs1 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[-1[ ]{._ ._18}if[ ]{._ ._18}calling[ ]{._ ._18}object’s[
]{._ ._18}area[ ]{._ ._18}is[ ]{._ ._18}less[ ]{._ ._18}than]{.ffa .ls8}

</div>

<div class="t m0 x1b hf y8d ffa fs1 fc0 sc0 ls8 ws0">

parameter[ ]{._ ._18}object’s[ ]{._ ._18}area,[ ]{._ ._18}or[ ]{._
._18}if[ ]{._ ._18}they[ ]{._ ._18}have[ ]{._ ._18}the

</div>

<div class="t m0 x1b hf y8e ffa fs1 fc0 sc0 ls8 ws0">

same[ ]{._ ._18}area,[ ]{._ ._18}but[ ]{._ ._18}calling[ ]{._
._18}object’s[ ]{._ ._18}perimeter[ ]{._ ._18}is

</div>

<div class="t m0 x1b hf y8f ffa fs1 fc0 sc0 ls8 ws0">

less[ ]{._ ._18}than[ ]{._ ._18}parameter[ ]{._ ._18}object’s[ ]{._
._18}perimeter.

</div>

<div class="t m0 xa hf y90 ffe fs1 fc0 sc0 ls0 ws0">

•[ ]{._ ._17}[0i[]{._ ._39}fc[]{._ ._39}a[]{._ ._39}l[]{._ ._3a}l[]{._
._39}i[]{._ ._39}n[]{._ ._3a}go[]{._ ._39}b[]{._ ._39}j[]{._ ._3a}e[]{._
._39}c[]{._ ._39}t[]{._ ._3a}’[]{._ ._39}sa[]{._ ._39}r[]{._ ._3a}e[]{._
._39}ai[]{._ ._39}se[]{._ ._3a}q[]{._ ._39}u[]{._ ._39}a[]{._
._3a}lt[]{._ ._39}op[]{._ ._39}a[]{._ ._3a}r[]{._ ._39}a[]{._
._3a}m[]{._ ._39}e[]{._ ._39}t[]{._ ._3a}e[]{._ ._39}r]{.ffa .ls1a}

</div>

<div class="t m0 x1b hf y91 ffa fs1 fc0 sc0 ls8 ws0">

object’s[ ]{._ ._18}area[ ]{._ ._18}and[ ]{._ ._18}calling[ ]{._
._18}object’s[ ]{._ ._18}perimeter[ ]{._ ._18}is

</div>

<div class="t m0 x1b hf y92 ffa fs1 fc0 sc0 ls8 ws0">

equal[ ]{._ ._18}to[ ]{._ ._18}parameter[ ]{._ ._18}object’s[ ]{._
._18}perimeter.

</div>

<div class="t m0 x13 h9 y93 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Rectangle[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y94 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._20}[private[ ]{._ ._1f}double[ ]{._ ._1f}[width,[ ]{._
._1f}height;]{.ff7 .fc0 .ls3}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y95 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._20}[//[assume[ ]{._ ._1f}getters[ ]{._ ._1f}and[ ]{._
._1f}sett[]{._ ._26}ers]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 h9 y96 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._20}[public[ ]{._ ._1f}double[ ]{._ ._1f}[area()[ ]{._ ._1e}{[
]{._ ._1f}]{.ff7 .fc0}return[ ]{._ ._1f}[width]{.ff7 .fc0}]{.ff6 .fs4
.fc3 .ls2}

</div>

<div class="t m0 x21 ha y97 ff7 fs4 fc0 sc0 ls0 ws0">

\*

</div>

<div class="t m0 x22 ha y96 ff7 fs4 fc0 sc0 ls2 ws0">

height;[ ]{._ ._1f}}

</div>

<div class="t m0 x13 h9 y98 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._20}[public[ ]{._ ._1f}double[ ]{._ ._1f}[perimeter()[ ]{._
._1e}{[ ]{._ ._1f}]{.ff7 .fc0}return[ ]{._ ._1f}]{.ff6 .fs4 .fc3
.ls2}[2]{.ff7 .fs4}

</div>

<div class="t m0 x21 ha y99 ff7 fs4 fc0 sc0 ls0 ws0">

\*

</div>

<div class="t m0 x23 ha y98 ff7 fs4 fc0 sc0 ls1b ws0">

(width[ ]{._ ._1f}+[ ]{._ ._1f}heig[]{._ ._26}ht);[ ]{._ ._1f}}

</div>

<div class="t m0 x13 ha y9a ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y9b ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._18}here

</div>

<div class="t m0 x12 hf y9c ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[3]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

13

</div>

[](#pf1a){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:159.200000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pfe" class="pf w0 h0" data-page-no="e">

<div class="pc pce w0 h0">

![](data:image/png;base64,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){.bi
.x7 .y9d .w2 .h1a}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}5.

</div>

<div class="t m0 x24 h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

U[]{._ ._0}nit[ ]{._ ._4}testing[ ]{._ ._2}methods[ ]{._ ._2}of[ ]{._
._4}a[ ]{._ ._2}class

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

An[ ]{._ ._d}example[ ]{._ ._d}class[ ]{._ ._2}with[ ]{._ ._8}a[ ]{._
._2}method[ ]{._ ._8}that[ ]{._ ._2}will[ ]{._ ._8}not[ ]{._
._2}produce[ ]{._ ._8}the[ ]{._ ._2}expected[ ]{._ ._8}result[ ]{._
._d}in[ ]{._ ._d}all[ ]{._ ._2}situa-

</div>

<div class="t m0 x7 h5 y4f ff3 fs2 fc0 sc0 ls0 ws0">

tions.

</div>

<div class="t m0 xe h9 y9e ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Line[ ]{._ ._1f}{]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe h9 y9f ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._20}[private[ ]{._ ._1f}[int[ ]{._ ._1f}[x1,[ ]{._ ._1f}y1,[
]{._ ._1e}x2,[ ]{._ ._1f}y2;]{.ff7 .fc0}]{.ls3}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe ha ya0 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._20}[//[other[ ]{._ ._1f}parts]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 xe h9 ya1 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._20}[public[ ]{._ ._1f}double[ ]{._ ._1f}[getMidX()[ ]{._
._1e}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe h9 ya2 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._21}[return[ ]{._ ._1f}[x1+x2/2;[ ]{._ ._1f}[//[i[ ]{._
._1f}[know]{.ls2}.]{.ls0}]{.fc2}]{.ff7 .fc0 .ls3}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe ha ya3 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._20}[}]{.ff7 .fs4}

</div>

<div class="t m0 xe ha ya4 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

14

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pff" class="pf w0 h0" data-page-no="f">

<div class="pc pcf w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAABfCAIAAABKnOD7AAAACXBIWXMAABYlAAAWJQFJUiTwAAABjUlEQVR42u3WsREAIAwDscD+47oPc5iTRvjqJ8kAAFBnd0UAAKhzbBwAQKMrAQCAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAGDjAACwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAYOMAALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwBg4wAAsHEAANg4AABsHACAjQMAwMYBAGDjAABsHAAANg4AABsHAICNAwCwcQAA2DgAAGwcAICNAwDAxgEAYOMAAGwcAAA2DgAAGwcAgI0DALBxAADYOAAAbBwAgI0DAMDGAQBg4wAAbBwAADYOAAAbBwCAjQMAsHEAANg4AABsHADAt5KIAABQ5wFGnAxqL8vUgwAAAABJRU5ErkJggg==){.bi
.x7 .y23 .w2 .h6}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}6.

</div>

<div class="t m0 xd h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

JU[]{._ ._0}nit[ ]{._ ._4}testing

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

JU[]{._ ._0}nit[ ]{._ ._37}provides[ ]{._ ._2f}a[ ]{._ ._37}framework[
]{._ ._37}for[ ]{._ ._37}testing[ ]{._ ._37}individual[ ]{._
._22}methods.[ ]{._ ._d}It[ ]{._ ._2f}works[ ]{._ ._37}based[ ]{._
._37}on[ ]{._ ._37}following

</div>

<div class="t m0 x7 h5 y4f ff3 fs2 fc0 sc0 ls0 ws0">

assertions:

</div>

<div class="t m0 x17 h5 ya5 ff3 fs2 fc0 sc0 ls0 ws0">

1.[ ]{._ ._17}[assertEquals(expected[ ]{._ ._8}double,[ ]{._ ._d}double[
]{._ ._8}returned[ ]{._ ._d}by[ ]{._ ._8}method,[ ]{._ ._8}tolerance)[
]{._ ._2}]{.ff2 .fc2}:

</div>

<div class="t m0 x12 h5 ya6 ff3 fs2 fc0 sc0 ls0 ws0">

passes[ ]{._ ._d}if,

</div>

<div class="t m0 x12 hc ya7 ff7 fs5 fc0 sc0 ls0 ws0">

Math.abs(expected[ ]{._ ._17}double[ ]{._ ._17}-[ ]{._ ._17}double[ ]{._
._17}returned[ ]{._ ._17}by[ ]{._ ._17}method)[ ]{._ ._17}&lt;=[ ]{._
._e}tolerance

</div>

<div class="t m0 x17 h5 ya8 ff3 fs2 fc0 sc0 ls0 ws0">

2.[ ]{._ ._17}[assertEquals(expected[ ]{._ ._8}integer[]{._ ._0},[ ]{._
._8}integer[ ]{._ ._8}returned[ ]{._ ._8}by[ ]{._ ._d}method)[ ]{._
._d}[:[ ]{._ ._2}passes[ ]{._ ._d}if,]{.ff3 .fc0}]{.ff2 .fc2}

</div>

<div class="t m0 x12 hc ya9 ff7 fs5 fc0 sc0 ls0 ws0">

expected[ ]{._ ._17}integer[ ]{._ ._17}==[ ]{._ ._17}integer[ ]{._
._17}returned[ ]{._ ._17}by[ ]{._ ._17}method

</div>

<div class="t m0 x17 h5 yaa ff3 fs2 fc0 sc0 ls0 ws0">

3.[ ]{._ ._17}[assertT[]{._ ._0}rue(boolean[ ]{._ ._8}value)[ ]{._
._8}[:[ ]{._ ._2}passes[ ]{._ ._2}if[ ]{._ ._8}parameter[ ]{._ ._d}is[
]{._ ._1b}]{.ff3 .fc0}true[ ]{._ ._d}[.]{.ff3 .fc0}]{.ff2 .fc2}

</div>

<div class="t m0 x17 h5 yab ff3 fs2 fc0 sc0 ls0 ws0">

4.[ ]{._ ._17}[assertT[]{._ ._0}rue(boolean[ ]{._ ._8}value)[ ]{._
._8}[:[ ]{._ ._2}passes[ ]{._ ._2}if[ ]{._ ._8}parameter[ ]{._ ._d}is[
]{._ ._1b}]{.ff3 .fc0}false[ ]{._ ._d}[.]{.ff3 .fc0}]{.ff2 .fc2}

</div>

<div class="t m0 x17 h5 yac ff3 fs2 fc0 sc0 ls0 ws0">

5.[ ]{._ ._17}[assertN[]{._ ._0}ull(Object/array)[ ]{._ ._d}[:[ ]{._
._2}passes[ ]{._ ._2}if[ ]{._ ._8}parameter[ ]{._ ._d}is[ ]{._
._1e}]{.ff3 .fc0}null[ ]{._ ._2}[.]{.ff3 .fc0}]{.ff2 .fc2}

</div>

<div class="t m0 x17 h5 yad ff3 fs2 fc0 sc0 ls0 ws0">

6.[ ]{._ ._17}[assertN[]{._ ._0}otNull(Object/array)[ ]{._ ._8}[:[ ]{._
._2}passes[ ]{._ ._d}if[ ]{._ ._2}par[]{._ ._3}ameter[ ]{._ ._d}is[ ]{._
._d}[NO[]{._ ._3}T[ ]{._ ._1e}[null[ ]{._
._d}]{.fc2}[.]{.ff3}]{.ff2}]{.ff3 .fc0}]{.ff2 .fc2}

</div>

<div class="t m0 x17 h5 yae ff3 fs2 fc0 sc0 ls0 ws0">

7.[ ]{._ ._17}M[]{._ ._0}ore[ ]{._ ._d}assertions[ ]{._ ._d}can[ ]{._
._2}be[ ]{._ ._8}found[ ]{._ ._2}at:

</div>

<div class="t m0 x12 h5 yaf ff3 fs2 fc1 sc0 ls0 ws0">

http://junit.org/junit4/javadoc/latest/org/junit/Assert.html

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

15

</div>

[](http://junit.org/junit4/javadoc/latest/org/junit/Assert.html){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:115.568000px;bottom:356.072000px;width:298.043000px;height:12.765000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf10" class="pf w0 h0" data-page-no="10">

<div class="pc pc10 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyQAAALSCAIAAACj1ILjAAAACXBIWXMAABYlAAAWJQFJUiTwAAAKwklEQVR42u3ZsQ0DQQwDQcsFXP91HpjTTbzwDmZKYLQAP0k+AADsmLYz03ttAQDwcGmd87UCAMAesQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2DIBAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxZQIAALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgAAYgsAQGwBAIgtAADEFgDAG5IYAQBgybS1AgDAEjciAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGLLBAAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAADEFgCA2AIAEFsAAIgtAIA3JDECAMCSaTszvdcWAAAPl9Y5bkQAgEViCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxZQIAALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAP8riREAAJb8AFOvIAcLEhANAAAAAElFTkSuQmCC){.bi
.x17 .yb0 .w3 .h1b}
<div class="t m0 xe h15 yb1 ff3 fs3 fc0 sc0 ls0 ws0">

1

</div>

<div class="t m0 xe hb yb2 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._5}[import[ ]{._ ._17}static[ ]{._
._17}[org.junit.Assert.]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 x25 hc yb3 ff7 fs5 fc0 sc0 ls0 ws0">

\*

</div>

<div class="t m0 x26 hc yb2 ff7 fs5 fc0 sc0 ls0 ws0">

;

</div>

<div class="t m0 xe hb yb4 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._5}[import[ ]{._ ._17}[org.junit.Test;]{.ff7 .fc0 .ls6}]{.ff6
.fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb yb5 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._5}[public[ ]{._ ._17}class[ ]{._ ._17}[LineTest[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc yb6 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._24}[@Test]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hb yb7 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[public[ ]{._ ._17}[void[ ]{._ ._17}]{.ls6}[testGetMidX()[
]{._ ._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb yb8 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._25}[Line[ ]{._ ._17}a[ ]{._ ._17}=[ ]{._ ._17}[new[ ]{._
._17}]{.ff6 .fc3 .ls6}Line(0,[ ]{._ ._17}10,[ ]{._ ._17}8,[ ]{._
._17}12);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc yb9 ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._25}[assertEquals(4,[ ]{._ ._17}a.getMidX(),[ ]{._
._17}0.001);[ ]{._ ._17}[//[passes]{.ls6}]{.fc2}]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hb yba ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._25}[Line[ ]{._ ._17}b[ ]{._ ._17}=[ ]{._ ._17}[new[ ]{._
._17}]{.ff6 .fc3 .ls6}Line(5,[ ]{._ ._17}10,[ ]{._ ._17}6,[ ]{._
._17}12);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 x7 hc ybb ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._25}[assertEquals(5.5,[ ]{._ ._17}b.getMidX(),[ ]{._
._17}0.001);[ ]{._ ._17}[//[fails]{.ls6}]{.fc2}]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 x7 hc ybc ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 x7 h7 ybd ff1 fs2 fc0 sc0 ls0 ws0">

6.0.1[ ]{._ ._17}Corrected[ ]{._ ._22}version[ ]{._ ._22}by[ ]{._
._8}looking[ ]{._ ._8}at[ ]{._ ._8}JUnit[ ]{._ ._8}failure

</div>

<div class="t m0 xe hb ybe ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._17}class[ ]{._ ._17}[Line[ ]{._ ._17}{]{.ff7
.fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb ybf ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._24}[private[ ]{._ ._17}[int[ ]{._ ._17}[x1,[ ]{._ ._17}y1,[
]{._ ._17}x2,[ ]{._ ._17}y2;]{.ff7 .fc0}]{.ls6}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc yc0 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._24}[//[other[ ]{._ ._17}parts]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hb yc1 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._24}[public[ ]{._ ._17}double[ ]{._ ._17}[getMidX()[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb yc2 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._25}[return[ ]{._ ._17}[(x1+x2)/2.0[;]{.fc0 .ls0}]{.ff7}]{.ff6
.fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc yc3 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[}]{.ff7 .fs5}

</div>

<div class="t m0 xe hc yc4 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

16

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf11" class="pf w0 h0" data-page-no="11">

<div class="pc pc11 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAARcCAIAAAA4R7ZGAAAACXBIWXMAABYlAAAWJQFJUiTwAAARJUlEQVR42u3ZsYoEIRBFUWsxFP//OxsrG6gNBjpfsBncOScyquBFF2xrrQYAwHGqyggAAMcJGQcAcKIfEwAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEA/FtrLSMAABwnqsoKAADH8akKACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIONMAAAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGScCQAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOACA79O3X8zMMYZlAQCeUFXvR9yvjSKirsvKAACbK2vOO958qgIAHEnGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4EwAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAAD8Vd9+MTNbazGncQEAnhNVZQUAgOP4VAUAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHADAN+rbL2bmGMOyAABPqKr3I+7XRhFR12VlAIDNlTXnHW8+VQEAjiTjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAn9a3X8zM1lrMaVwAgOdEVW0/+nq9eu/GBQB4rrJ+AYRdR1DGXpXIAAAAAElFTkSuQmCC){.bi
.x7 .yc5 .w2 .h1c}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}7.

</div>

<div class="t m0 x27 h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

S[]{._ ._3}tatic[ ]{._ ._2}members[ ]{._ ._4}vs.[ ]{._ ._4}Instance[
]{._ ._2}members

</div>

<div class="t m0 x7 h5 y26 ff3 fs2 fc0 sc0 ls0 ws0">

S[]{._ ._3}tatic[ ]{._ ._8}members[ ]{._ ._d}are[ ]{._ ._22}the[ ]{._
._d}ones[ ]{._ ._8}that[ ]{._ ._d}are[ ]{._ ._8}accessed[ ]{._ ._8}in[
]{._ ._d}the[ ]{._ ._8}context[ ]{._ ._d}of[ ]{._ ._d}a[ ]{._
._8}class.[ ]{._ ._2}Y[]{._ ._a}ou[ ]{._ ._8}don[]{._ ._0}’[]{._ ._a}t[
]{._ ._d}need

</div>

<div class="t m0 x7 h5 y4f ff3 fs2 fc0 sc0 ls0 ws0">

to[ ]{._ ._8}create[ ]{._ ._22}objects[ ]{._ ._8}of[ ]{._ ._8}that[ ]{._
._d}class[ ]{._ ._8}in[ ]{._ ._8}order[ ]{._ ._22}to[ ]{._ ._d}access[
]{._ ._8}them.[ ]{._ ._2}F[]{._ ._0}or[ ]{._ ._8}example,[ ]{._
._8}consider[ ]{._ ._8}the[ ]{._ ._8}num-

</div>

<div class="t m0 x7 h5 y50 ff3 fs2 fc0 sc0 ls0 ws0">

ber[ ]{._ ._2}of[ ]{._ ._d}eyes[ ]{._ ._2}[dinosaurs[ ]{._
._d}]{.ff2}have.[ ]{._ ._4}Note[]{._ ._0},[ ]{._ ._2}we[ ]{._
._2}didn[]{._ ._a}’[]{._ ._0}t[ ]{._ ._d}say[]{._ ._0},[ ]{._ ._d}how[
]{._ ._d}many[ ]{._ ._2}eyes[ ]{._ ._2}does[ ]{._ ._d}Dorothy[ ]{._
._2}the[ ]{._ ._d}di-

</div>

<div class="t m0 x7 h5 yc6 ff3 fs2 fc0 sc0 ls0 ws0">

nosaur[]{._ ._0},[ ]{._ ._d}or[ ]{._ ._d}T[]{._ ._0}yr[]{._ ._3}one[
]{._ ._d}the[ ]{._ ._d}dinosaur[ ]{._ ._d}have.

</div>

<div class="t m0 xf h5 yc7 ff3 fs2 fc0 sc0 ls0 ws0">

W[]{._ ._0}e[ ]{._ ._2}don[]{._ ._0}’[]{._ ._a}t[ ]{._ ._4}even[ ]{._
._4}need[ ]{._ ._2}any[ ]{._ ._4}dinosaur[ ]{._ ._4}to[ ]{._ ._2}be[
]{._ ._4}alive[ ]{._ ._4}to[ ]{._ ._2}answer[ ]{._ ._4}that[ ]{._
._2}question,[ ]{._ ._4}since[ ]{._ ._4}it’[]{._ ._a}s[ ]{._ ._2}an

</div>

<div class="t m0 x7 h5 yc8 ff3 fs2 fc0 sc0 ls0 ws0">

attribute[ ]{._ ._d}of[ ]{._ ._2}the[ ]{._ ._8}[collective[ ]{._
._4}]{.ffd}(the[ ]{._ ._8}class)[ ]{._ ._d}rather[ ]{._ ._d}than[ ]{._
._2}an[ ]{._ ._8}[individual[ ]{._ ._4}]{.ffd}(an[ ]{._ ._d}object).

</div>

<div class="t m0 xf h5 yc9 ff3 fs2 fc0 sc0 ls0 ws0">

On[ ]{._ ._22}the[ ]{._ ._8}other[ ]{._ ._22}hand,[ ]{._ ._8}the[ ]{._
._8}variables[ ]{._ ._3b}[weight,[ ]{._ ._22}height[ ]{._ ._3b}]{.ff2
.fc2}are[ ]{._ ._37}di[ﬀ]{.ff8}erent[ ]{._ ._22}for[ ]{._ ._8}each[ ]{._
._22}dinosaur[ ]{._ ._8}that

</div>

<div class="t m0 x7 h5 yca ff3 fs2 fc0 sc0 ls0 ws0">

was[ ]{._ ._d}there[]{._ ._0}.[ ]{._ ._2}Hence[]{._ ._0},[ ]{._
._2}they[ ]{._ ._8}are[ ]{._ ._8}[instance[ ]{._ ._d}variables]{.ffd}.[
]{._ ._2}Similarly[]{._ ._a},[ ]{._ ._d}the[ ]{._ ._d}body[ ]{._
._2}mass[ ]{._ ._8}index[ ]{._ ._d}(deﬁned

</div>

<div class="t m0 x7 h5 ycb ff3 fs2 fc0 sc0 ls0 ws0">

as[ ]{._ ._2}weight[ ]{._ ._2}divided[ ]{._ ._4}b[]{._ ._0}y[ ]{._
._4}squar[]{._ ._0}e[ ]{._ ._4}of[ ]{._ ._2}height)[ ]{._ ._2}is[ ]{._
._4}an[ ]{._ ._2}[instance[ ]{._ ._2}method]{.ffd},[ ]{._ ._4}that[ ]{._
._2}must[ ]{._ ._2}be[ ]{._ ._4}called[ ]{._ ._2}on

</div>

<div class="t m0 x7 h5 ycc ff3 fs2 fc0 sc0 ls0 ws0">

an[ ]{._ ._d}[individual[ ]{._ ._4}]{.ffd}(the[ ]{._ ._8}object),[ ]{._
._2}not[ ]{._ ._8}the[ ]{._ ._d}[collective[ ]{._ ._4}]{.ffd}(the[ ]{._
._8}class)

</div>

<div class="t m0 xf h5 ycd ff3 fs2 fc0 sc0 ls0 ws0">

Consider[ ]{._ ._8}the[ ]{._ ._2}follo[]{._ ._0}wing[ ]{._ ._d}class:

</div>

<div class="t m0 xe h14 yce ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._16}[class[ ]{._ ._e}]{.ff6 .fs4 .fc3 .lsd}[Dinosaur[ ]{._
._2a}{]{.fs8 .ls1c}

</div>

<div class="t m0 xe h14 ycf ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._2c}[public[ ]{._ ._e}static[ ]{._ ._e}[int[ ]{._
._e}]{.lsf}]{.ff6 .fs4 .fc3 .ls9}[nEyes[ ]{._ ._17}=[ ]{._ ._e}2[]{._
._2b};]{.fs8 .ls1d}

</div>

<div class="t m0 xe h14 yd0 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._2c}[public[ ]{._ ._e}static[ ]{._ ._e}[int[ ]{._
._e}]{.lsf}]{.ff6 .fs4 .fc3 .ls9}[nEars[ ]{._ ._17}=[ ]{._ ._e}2 ;]{.fs8
.ls1e}

</div>

<div class="t m0 xe h14 yd1 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._2c}[public[ ]{._ ._e}static[ ]{._ ._e}double[ ]{._ ._2a}]{.ff6
.fs4 .fc3 .ls9}[eyesToEarsRatio[ ]{._ ._2f}( )[ ]{._ ._18}{]{.fs8 .ls1f}

</div>

<div class="t m0 xe h14 yd2 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._31}[return[ ]{._ ._e}]{.ff6 .fs4 .fc3 .ls9}[nEyes]{.fs8 .ls1d}

</div>

<div class="t m0 x28 h14 yd3 ff5 fs8 fc0 sc0 ls0 ws0">

\*

</div>

<div class="t m0 x29 h14 yd2 ff3 fs8 fc0 sc0 ls20 ws0">

1.0[ ]{._ ._e}/[ ]{._ ._17}n[]{._ ._0}Ea[]{._ ._0}r[]{._ ._0}s ;

</div>

<div class="t m0 xe h14 yd4 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._36}[}]{.fs8}

</div>

<div class="t m0 xe h15 yd5 ff3 fs3 fc0 sc0 ls0 ws0">

7

</div>

<div class="t m0 xe h14 yd6 ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._2c}[private[ ]{._ ._e}[double[ ]{._ ._e}]{.ls9}]{.ff6 .fs4
.fc3 .lse}[weight[ ]{._ ._8},[ ]{._ ._18}he ig ht[ ]{._ ._37};]{.fs8
.ls21}

</div>

<div class="t m0 xe ha yd7 ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._24}[//[]{._ ._2b}[assume[ ]{._ ._e}[getters[]{._ ._2b}[,[ ]{._
._2a}[setters]{.lse}]{.ls0}]{.ls22}]{.ls9}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 x7 ha yd8 ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._24}[//[]{._ ._2b}[assume[ ]{._ ._e}[parameterized[ ]{._
._e}[constructors]{.ls24}]{.ls23}]{.ls9}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 x7 h14 yd9 ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._2c}[public[ ]{._ ._e}double[ ]{._ ._e}]{.ff6 .fs4 .fc3
.ls9}[bodyMassIndex[ ]{._ ._2f}([ ]{._ ._2b})[ ]{._ ._28}{]{.fs8 .ls25}

</div>

<div class="t m0 x7 h14 yda ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._25}[return[ ]{._ ._e}]{.ff6 .fs4 .fc3 .ls9}[weight[ ]{._
._2f}/[]{._ ._26}([ ]{._ ._2f}h[]{._ ._26}e[]{._ ._26}i[]{._ ._26}g[]{._
._26}ht]{.fs8 .ls26}

</div>

<div class="t m0 x2a h14 ydb ff5 fs8 fc0 sc0 ls0 ws0">

\*

</div>

<div class="t m0 xb h14 yda ff3 fs8 fc0 sc0 ls27 ws0">

height )[ ]{._ ._22};

</div>

<div class="t m0 x7 h14 ydc ff3 fs3 fc0 sc0 ls0 ws0">

13[ ]{._ ._36}[}]{.fs8}

</div>

<div class="t m0 x7 h14 ydd ff3 fs3 fc0 sc0 ls0 ws0">

14[ ]{._ ._3c}[}]{.fs8}

</div>

<div class="t m0 x7 h17 yde ff1 fs6 fc0 sc0 ls0 ws0">

7.1[ ]{._ ._e}Static[ ]{._ ._8}member[ ]{._ ._d}access

</div>

<div class="t m0 xe h9 ydf ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[int[ ]{._ ._1f}[eyeCount[ ]{._ ._1f}=[ ]{._
._1f}[Dinosaur]{.fc4}[.nEyes;]{.ls1b}]{.ff7 .fc0 .ls2}]{.ff6 .fs4 .fc3
.ls3}

</div>

<div class="t m0 xe h9 ye0 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._5}[double[ ]{._ ._1f}[prop[ ]{._ ._1f}=[ ]{._
._1f}[Dinosaur]{.fc4}[.eyesToEar[]{._ ._26}sRatio();]{.ls1b}]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

17

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf12" class="pf w0 h0" data-page-no="12">

<div class="pc pc12 w0 h0">

![](data:image/png;base64,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){.bi
.xf .ye1 .w2 .h1d}
<div class="t m0 x7 h17 y6b ff1 fs6 fc0 sc0 ls0 ws0">

7.2[ ]{._ ._e}Instance[ ]{._ ._8}member[ ]{._ ._d}access

</div>

<div class="t m0 xe h9 ye2 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[Dinosaur[ ]{._ ._1f}dorothy[ ]{._ ._1f}=[ ]{._ ._1f}[new[
]{._ ._1f}]{.ff6 .fc3 .ls3}Dinosau[]{._ ._26}r(450,3.6);]{.ff7 .fs4
.ls2}

</div>

<div class="t m0 xe h9 ye3 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._5}[double[ ]{._ ._1f}[w=[dorothy]{.fc4
.ls2}[.getWeight();]{.ls1b}]{.ff7 .fc0 .ls4}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe h9 ye4 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._5}[double[ ]{._ ._1f}[h=[dorothy]{.fc4
.ls2}[.getHeight();]{.ls1b}]{.ff7 .fc0 .ls4}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xe h9 ye5 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._5}[double[ ]{._ ._1f}[bmi[ ]{._ ._1f}=[ ]{._
._1f}[dorothy]{.fc4}[.bodyMass[]{._ ._26}Index();]{.ls1b}]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 xf h5 ye6 ff3 fs2 fc0 sc0 ls0 ws0">

N[]{._ ._3}ote[ ]{._ ._d}that[ ]{._ ._2}in[ ]{._ ._8}this[ ]{._
._2}example[ ]{._ ._d}the[ ]{._ ._d}instance[ ]{._ ._2}variables[ ]{._
._d}are[ ]{._ ._d}private,[ ]{._ ._d}otherwise[ ]{._ ._2}(if[ ]{._
._d}they[ ]{._ ._2}w[]{._ ._3}ere

</div>

<div class="t m0 x7 h5 ye7 ff3 fs2 fc0 sc0 ls0 ws0">

public),[ ]{._ ._d}they[ ]{._ ._d}could[ ]{._ ._2}be[ ]{._ ._8}accessed[
]{._ ._d}in[ ]{._ ._2}the[ ]{._ ._8}same[ ]{._ ._2}way[ ]{._ ._8}(on[
]{._ ._d}a[ ]{._ ._2}calling[ ]{._ ._8}object).

</div>

<div class="t m0 x10 he ye8 ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}4

</div>

<div class="t m0 x2b he ye9 ff9 fs1 fc5 sc0 ls0 ws0">

Accessing[ ]{._ ._18}static[ ]{._ ._28}and[ ]{._ ._18}instance[ ]{._
._28}members

</div>

<div class="t m0 x12 hf yea ffa fs1 fc0 sc0 ls8 ws0">

Display[ ]{._ ._18}the[ ]{._ ._18}members[ ]{._ ._29}[data1,[ ]{._
._18}data2,[ ]{._ ._28}method1,[ ]{._ ._18}method2]{.ff9 .fc2 .ls0}

</div>

<div class="t m0 x12 hf yeb ffa fs1 fc0 sc0 ls8 ws0">

of[ ]{._ ._18}class[ ]{._ ._29}[MyClass[ ]{._ ._29}]{.ff9 .fc2 .ls0}(or[
]{._ ._18}object[ ]{._ ._29}[obj[ ]{._ ._38}]{.ff9 .fc2 .ls0}of[ ]{._
._18}class

</div>

<div class="t m0 x12 hf yec ff9 fs1 fc2 sc0 ls0 ws0">

MyClass[ ]{._ ._18}[)i[]{._ ._39}nt[]{._ ._39}h[]{._ ._3a}ec[]{._
._39}l[]{._ ._39}i[]{._ ._3a}e[]{._ ._39}n[]{._ ._39}tc[]{._ ._3a}o[]{._
._39}d[]{._ ._39}e[]{._ ._3a}.]{.ffa .fc0 .ls1a}

</div>

<div class="t m0 x13 h9 yed ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[MyClass[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 yee ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._3d}[public[ ]{._ ._1f}[int[ ]{._ ._1f}]{.ls3}[data1;]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 yef ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._3d}[public[ ]{._ ._1f}static[ ]{._ ._1f}[int[ ]{._
._1f}]{.ls3}[data2;]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 yf0 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._3d}[public[ ]{._ ._1f}static[ ]{._ ._1f}[int[ ]{._
._1f}]{.ls3}[method[]{._ ._26}1()[ ]{._ ._1f}{[ ]{._ ._1f}]{.ff7
.fc0}return[ ]{._ ._1f}[data2;[ ]{._ ._1e}}]{.ff7 .fc0}]{.ff6 .fs4 .fc3
.ls2}

</div>

<div class="t m0 x13 h9 yf1 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._3d}[public[ ]{._ ._1f}[int[ ]{._ ._1f}]{.ls3}[method2()[ ]{._
._1f}{[ ]{._ ._1e}]{.ff7 .fc0}return[ ]{._ ._1f}[data1;[ ]{._
._1f}}]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha yf2 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 h15 yf3 ff3 fs3 fc0 sc0 ls0 ws0">

7

</div>

<div class="t m0 x13 h9 yf4 ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._5}[class[ ]{._ ._1f}[Client[ ]{._ ._1f}{]{.ff7 .fc0}]{.ff6
.fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 yf5 ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._3d}[public[ ]{._ ._1f}static[ ]{._ ._1f}[void[ ]{._
._1f}]{.ls3}[main(String\[\][ ]{._ ._1e}args)[ ]{._ ._1f}{]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x12 h9 yf6 ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._3e}[MyClass[ ]{._ ._1f}obj[ ]{._ ._1f}=[ ]{._ ._1e}[new[ ]{._
._1f}]{.ff6 .fc3}MyClass();]{.ff7 .fs4 .ls2}

</div>

<div class="t m0 x12 ha yf7 ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._3e}[//[your[ ]{._ ._1f}code]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x12 ha yf8 ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._3d}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 ha yf9 ff3 fs3 fc0 sc0 ls0 ws0">

13[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf yfa ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._18}here

</div>

<div class="t m0 x12 hf yfb ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[4]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

18

</div>

[](#pf1b){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:267.314000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf13" class="pf w0 h0" data-page-no="13">

<div class="pc pc13 w0 h0">

![](data:image/png;base64,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){.bi
.x17 .yfc .w3 .h1e}
<div class="t m0 x7 h17 y6b ff1 fs6 fc0 sc0 ls0 ws0">

7.3[ ]{._ ._e}T[]{._ ._a}ypical[ ]{._ ._8}static[ ]{._ ._d}methods

</div>

<div class="t m0 x7 h5 yfd ff3 fs2 fc0 sc0 ls0 ws0">

T[]{._ ._a}ypically[]{._ ._0},[ ]{._ ._2}methods[ ]{._ ._2}are[ ]{._
._2}classiﬁed[ ]{._ ._2}as[ ]{._ ._2}static,[ ]{._ ._2}if[ ]{._ ._4}the[
]{._ ._2}values[ ]{._ ._2}they[ ]{._ ._2}operate[ ]{._ ._2}on[ ]{._
._2}ar[]{._ ._3}e[ ]{._ ._2}passed[ ]{._ ._2}to

</div>

<div class="t m0 x7 h5 yfe ff3 fs2 fc0 sc0 ls0 ws0">

the[ ]{._ ._d}methods.[ ]{._ ._2}F[]{._ ._0}or[ ]{._ ._d}example:

</div>

<div class="t m0 xe h14 yff ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._16}[class[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .lsd}[StringService[
]{._ ._2a}{]{.fs8 .ls28}

</div>

<div class="t m0 xe h14 y100 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._2c}[public[ ]{._ ._e}static[ ]{._ ._e}[char[ ]{._
._2d}]{.ls14}]{.ff6 .fs4 .fc3 .ls9}[lastItem ( Strin[]{._ ._26}g[ ]{._
._e}s )[ ]{._ ._2a}{]{.fs8 .ls29}

</div>

<div class="t m0 xe h14 y101 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._25}[if[]{._ ._2b}]{.ff6 .fs4 .fc3 .lsc}[(s[ ]{._ ._3b}=[]{._
._32}=[ ]{._ ._1f}[null[ ]{._ ._18}]{.ff6 .fs4 .fc3 .ls13}[||[ ]{._
._2a}s.[]{._ ._26}l[]{._ ._a}e[]{._ ._32}n[]{._ ._a}g[]{._ ._a}t[]{._
._32}h[]{._ ._26}([]{._ ._0})[ ]{._ ._1e}=[]{._ ._3f}=[ ]{._ ._3b}0[]{._
._a})]{.ls2b}]{.fs8 .ls2a}

</div>

<div class="t m0 xe h14 y102 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._40}[return[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .ls9}[([ ]{._
._22}[char[ ]{._ ._2f}]{.ff6 .fs4 .fc3 .ls13}[)0[]{._
._a};]{.ls2c}]{.fs8}

</div>

<div class="t m0 xe h14 y103 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._25}[return[ ]{._ ._e}]{.ff6 .fs4 .fc3 .ls9}[s.c[]{._
._a}h[]{._ ._32}a[]{._ ._32}r[]{._ ._a}A[]{._ ._32}t[]{._ ._3}([]{._
._0}s.[]{._ ._26}l[]{._ ._a}e[]{._ ._41}n[]{._ ._41}g[]{._ ._41}t[]{._
._a}h([]{._ ._0})[ ]{._ ._3b}[[ ]{._ ._2a}]{.ffc .ls0}[1)[ ]{._
._37};]{.ls2e}]{.fs8 .ls2d}

</div>

<div class="t m0 xe h14 y104 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._36}[}]{.fs8}

</div>

<div class="t m0 xe h14 y105 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._42}[}]{.fs8}

</div>

<div class="t m0 xe h14 y106 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._16}[class[ ]{._ ._2a}]{.ff6 .fs4 .fc3 .lsd}[IntegerService[
]{._ ._2d}{]{.fs8 .ls2f}

</div>

<div class="t m0 xe h14 y107 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._31}[public[ ]{._ ._e}static[ ]{._ ._e}[int[ ]{._
._e}]{.lsf}]{.ff6 .fs4 .fc3 .ls9}[getNumberOfDigits[ ]{._ ._2f}([]{._
._2b}[int[ ]{._ ._1f}]{.ff6 .fs4 .fc3 .lsf}[num[ ]{._ ._2f})[ ]{._
._27}{]{.ls30}]{.fs8 .ls1e}

</div>

<div class="t m0 xe h14 y108 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._43}[if[ ]{._ ._2b}]{.ff6 .fs4 .fc3 .lsc}[(n[]{._ ._a}u[]{._
._a}m[ ]{._ ._1f}==[ ]{._ ._e}0[]{._ ._30})]{.fs8 .ls31}

</div>

<div class="t m0 xe h14 y109 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._44}[return[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .ls9}[0;]{.fs8 .lsb}

</div>

<div class="t m0 xe ha y10a ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._43}[//[ ]{._ ._e}[Remove[ ]{._ ._e}[any[ ]{._ ._e}[sign[ ]{._
._e}from[ ]{._ ._e}]{.ls13}number[ ]{._
._2b}[,]{.ls0}]{.lsf}]{.ls9}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 xe ha y10b ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._43}[//[ ]{._ ._e}[add[ ]{._ ._e}]{.lsf}it[ ]{._ ._e}to[ ]{._
._17}[an[ ]{._ ._e}[empty[ ]{._ ._e}[string[ ]{._
._2b}[,]{.ls0}]{.lsf}]{.lsd}]{.ls32}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 xe ha y10c ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._43}[//[ ]{._ ._e}[return[ ]{._ ._e}[its[ ]{._
._e}]{.lsf}length [.]{.ls0}]{.ls9}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 xe h14 y10d ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._43}[return[ ]{._ ._2d}]{.ff6 .fs4 .fc3 .ls9}[(M[]{._
._a}a[]{._ ._a}t[]{._ ._a}h[]{._ ._26}. a[]{._ ._0}b[]{._ ._0}s[]{._
._30}([]{._ ._0}n[]{._ ._3f}u[]{._ ._32}m[]{._ ._0})[ ]{._ ._1b}+[ ]{._
._1b}"[]{._ ._26}"[]{._ ._2b}) .[ ]{._ ._37}le[]{._ ._0}ngt[]{._ ._3}h
([]{._ ._30})[ ]{._ ._22};]{.fs8 .ls29}

</div>

<div class="t m0 xe h14 y10e ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._45}[}]{.fs8}

</div>

<div class="t m0 x7 h14 y10f ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._3c}[}]{.fs8}

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

19

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf14" class="pf w0 h0" data-page-no="14">

<div class="pc pc14 w0 h0">

![](data:image/png;base64,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){.bi
.x7 .y110 .w2 .h1f}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}8.

</div>

<div class="t m0 x2c h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

M[]{._ ._3}anipulating[ ]{._ ._2}refer[]{._ ._0}ences

</div>

<div class="t m0 x7 h17 y111 ff1 fs6 fc0 sc0 ls0 ws0">

8.1[ ]{._ ._e}Shallow[ ]{._ ._8}copy

</div>

<div class="t m0 x7 h5 y112 ff3 fs2 fc0 sc0 ls0 ws0">

Consider[ ]{._ ._8}the[ ]{._ ._2}follo[]{._ ._0}wing[ ]{._ ._d}class[
]{._ ._2}deﬁnition[ ]{._ ._8}and[ ]{._ ._d}client[ ]{._ ._2}code:

</div>

<div class="t m0 xe hb y113 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._24}[public[ ]{._ ._17}class[ ]{._ ._17}[Circle[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y114 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._46}[private[ ]{._ ._17}double[ ]{._ ._17}[radius;]{.ff7
.fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y115 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._46}[//[other[ ]{._ ._17}parts]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hc y116 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._24}[}]{.ff7 .fs5}

</div>

<div class="t m0 xe h14 y117 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._36}[Circle[ ]{._ ._e}c[ ]{._ ._1f}=[ ]{._ ._1b}[new[ ]{._
._2d}]{.ff6 .fs4 .fc3 .lsf}Circle (3[]{._ ._3}0) ;]{.fs8 .lsb}

</div>

<div class="t m0 xe h14 y118 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._36}[Circle[ ]{._ ._17}d[ ]{._ ._3b}=[ ]{._ ._1e}c[]{._
._30};]{.fs8 .lsb}

</div>

<div class="t m0 xe ha y119 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._24}[// [c[ ]{._ ._2a}[and[ ]{._ ._e}]{.lsf}d[ ]{._
._2a}[refer[ ]{._ ._e}]{.lsd}]{.ls0}to[ ]{._ ._e}[same]{.ls13}]{.ff7
.fs4 .fc2 .lsc}

</div>

<div class="t m0 xe ha y11a ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._24}[//[]{._ ._2b}[instance[ ]{._ ._e}variable[ ]{._
._e}[space]{.lsd}]{.ls10}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 xe h14 y11b ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._47}[d.[]{._ ._2b}s[]{._ ._0}e[]{._ ._0}t[]{._ ._0}R[]{._
._0}a[]{._ ._0}d[]{._ ._0}i[]{._ ._0}u[]{._ ._48}s[]{._ ._30}([]{._
._3}5[]{._ ._0}0)[]{._ ._2b};]{.fs8 .ls33}

</div>

<div class="t m0 xe h14 y11c ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[System[ ]{._ ._37}.[ ]{._ ._37}ou t[ ]{._ ._37}.[ ]{._
._8}p[]{._ ._2b}r[]{._ ._30}i[]{._ ._2b}n[]{._ ._30}t[]{._ ._2b}l[]{._
._30}n[ ]{._ ._8}([ ]{._ ._2b}c[ ]{._ ._37}.[ ]{._ ._22}g e t R a d i u
s[ ]{._ ._37}([ ]{._ ._2b})[ ]{._ ._d})[ ]{._ ._8};[ ]{._ ._49}[//
??]{.ff7 .fs4 .fc2 .lsc}]{.fs8 .ls34}

</div>

<div class="t m0 xf h5 y11d ff3 fs2 fc0 sc0 ls0 ws0">

Object[ ]{._ ._2a}[d[ ]{._ ._2d}]{.ff2 .fc2}holds[ ]{._ ._4}r[]{._
._0}eference[ ]{._ ._4}to[ ]{._ ._2}the[ ]{._ ._4}same[ ]{._
._4}physical[ ]{._ ._4}object[ ]{._ ._2}as[ ]{._ ._2d}[c[ ]{._
._2}]{.ff2 .fc2}.[ ]{._ ._1b}Therefore[]{._ ._0},[ ]{._ ._4}when[ ]{._
._4}the

</div>

<div class="t m0 x7 h5 y11e ff2 fs2 fc2 sc0 ls0 ws0">

radius[ ]{._ ._1e}[of[ ]{._ ._d}object[ ]{._ ._1b}]{.ff3 .fc0}d[ ]{._
._1e}[is[ ]{._ ._d}modiﬁed,[ ]{._ ._1e}]{.ff3 .fc0}radius[ ]{._
._1b}[of[ ]{._ ._d}object[ ]{._ ._1e}]{.ff3 .fc0}c[ ]{._ ._1b}[also[
]{._ ._d}gets[ ]{._ ._d}updated.]{.ff3 .fc0}

</div>

<div class="t m0 x2c h4 y11f ff3 fs1 fc0 sc0 ls0 ws0">

c

</div>

<div class="t m0 x1d h4 y120 ff3 fs1 fc0 sc0 ls0 ws0">

d

</div>

<div class="t m0 x2d h4 y121 ff3 fs1 fc0 sc0 ls0 ws0">

radius=50

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

20

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf15" class="pf w0 h0" data-page-no="15">

<div class="pc pc15 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAAOWCAIAAABNk7UaAAAACXBIWXMAABYlAAAWJQFJUiTwAAAUjklEQVR42u3dT2hcdQLA8fcmExprOw45ScYKmW0qmoBIhDU9aJdYKYjdNpGgB6FL2YtC9iaCHru42Pai6EEPLruHFrYlalnatQ2KsqVhiX9qE2i1WWZkQiQlpDNY0m4nbw+vm3ar7MUweb/18zm990p54febw5ff7828OEmS6BbNZnN+fn5qamp6evry5csRAABramBgoLu7u6urq6Oj49br8a0ZNzEx8dprry0sLBgvAICsGR0d3blzZ1tb239lXLPZfPXVV8fHxw0QAEBmlcvlgwcPFovFmxm3b9++lYbL5XKbH9g8vGe4r7/PYAEArKHqxeqxQ8fOfHRmeXl5peTefvvttra2OEmSiYmJl156KQ24wZ2Du57bVewsGjUAgOw48u6RU++falxuRFE0Ojq6e/fu+Pr16yMjI+nzcNt3bd/zuz2GCQAgg06Pn35z35vp8djYWG5+fn7lOw27nttlgAAAsmnr4NZ1HevS48nJydzU1FR6sqVvi71UAIAse3THo+nB9PR0bnp6Oj0Z3jNsaAAAsmxl7/SLL77IrfzGr++lAgBk3Mre6czMTM5wAACESMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAAD46fKGALKv64mSQaD1Zj+sGQTIMqtxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAwM+I342DgPlZL1aFHyaEQFmNAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEA8NPlDQGEq+uJkkEA+NmyGgcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQD8jPjdOAjA7Ic1gwDAbazGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4QwAAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4A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){.bi
.xf .y122 .w2 .h20}
<div class="t m0 x10 he y42 ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}5

</div>

<div class="t m0 x2e he y43 ff9 fs1 fc5 sc0 ls0 ws0">

Create[ ]{._ ._18}a[ ]{._ ._28}shallow[ ]{._ ._18}copy

</div>

<div class="t m0 x12 hf y44 ffa fs1 fc0 sc0 ls8 ws0">

Create[ ]{._ ._18}a[ ]{._ ._18}shallow[ ]{._ ._18}copy[ ]{._ ._49}of[
]{._ ._38}[myObj[ ]{._ ._29}]{.ff9 .fc2 .ls0}into[ ]{._ ._29}[yourObj[
]{._ ._18}]{.ff9 .fc2 .ls0}[.]{.ls0}

</div>

<div class="t m0 x12 hf y78 ffa fs1 fc0 sc0 ls8 ws0">

Increase[ ]{._ ._18}the[ ]{._ ._18}radius[ ]{._ ._49}of[ ]{._
._38}[yourObj[ ]{._ ._29}]{.ff9 .fc2 .ls0}by[ ]{._ ._18}2.[ ]{._
._29}What[ ]{._ ._18}is[ ]{._ ._18}the

</div>

<div class="t m0 x12 hf y123 ffa fs1 fc0 sc0 ls8 ws0">

new[ ]{._ ._18}radius[ ]{._ ._18}of[ ]{._ ._29}[myObj[ ]{._ ._18}]{.ff9
.fc2 .ls0}[?]{.ls0}

</div>

<div class="t m0 x13 h9 y124 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Circle[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y125 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._3d}[private[ ]{._ ._1f}double[ ]{._ ._1f}[radius;]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y126 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._3d}[//[assume[ ]{._ ._1f}getters[,[ ]{._
._1f}]{.ls0}setters]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y127 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._3d}[//[ ]{._ ._1f}[and[ ]{._ ._1f}]{.ls2}constructors[ ]{._
._1f}[defined]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y128 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 h15 y129 ff3 fs3 fc0 sc0 ls0 ws0">

6

</div>

<div class="t m0 x13 h9 y12a ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[class[ ]{._ ._1f}[Client[ ]{._ ._1f}{]{.ff7 .fc0}]{.ff6
.fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y12b ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._3d}[public[ ]{._ ._1f}static[ ]{._ ._1f}[void[ ]{._
._1f}]{.ls3}[main(String\[\][ ]{._ ._1e}args)[ ]{._ ._1f}{]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y12c ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._3e}[Circle[ ]{._ ._1f}myObj[ ]{._ ._1f}=[ ]{._ ._1e}[new[ ]{._
._1f}]{.ff6 .fc3}Circle(1.5);]{.ff7 .fs4 .ls2}

</div>

<div class="t m0 x12 ha y12d ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._3e}[//[your[ ]{._ ._1f}code]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x12 ha y12e ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._3d}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 ha y12f ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y130 ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._49}here

</div>

<div class="t m0 x12 hf y131 ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[5]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x7 h17 y132 ff1 fs6 fc0 sc0 ls0 ws0">

8.2[ ]{._ ._e}Deep[ ]{._ ._8}copy

</div>

<div class="t m0 x7 h5 y133 ff3 fs2 fc0 sc0 ls0 ws0">

Object[ ]{._ ._1e}[d[ ]{._ ._1e}]{.ff2 .fc2}is[ ]{._ ._d}a[ ]{._
._d}clone[ ]{._ ._2}of[ ]{._ ._8}object[ ]{._ ._1e}[c[ ]{._ ._d}]{.ff2
.fc2}.[ ]{._ ._2}Object[ ]{._ ._1b}[c[ ]{._ ._1e}]{.ff2 .fc2}and[ ]{._
._1e}[d[ ]{._ ._1e}]{.ff2 .fc2}are[ ]{._ ._8}independent[ ]{._
._d}objects.[ ]{._ ._2}M[]{._ ._3}odifying

</div>

<div class="t m0 x7 h5 y134 ff3 fs2 fc0 sc0 ls0 ws0">

one[ ]{._ ._d}does[ ]{._ ._d}not[ ]{._ ._2}alter[ ]{._ ._8}the[ ]{._
._d}other[]{._ ._0}.

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

21

</div>

[](#pf1b){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:395.764000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf16" class="pf w0 h0" data-page-no="16">

<div class="pc pc16 w0 h0">

![](data:image/png;base64,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){.bi
.x17 .y135 .w3 .h21}
<div class="t m0 xe h14 y136 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._36}[Circle[ ]{._ ._e}c[ ]{._ ._1f}=[ ]{._ ._1b}[new[ ]{._
._2d}]{.ff6 .fs4 .fc3 .lsf}Circle (3[]{._ ._3}0) ;]{.fs8 .lsb}

</div>

<div class="t m0 xe h14 y137 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._36}[Circle[ ]{._ ._17}d[ ]{._ ._3b}=[ ]{._ ._1e}[new[ ]{._
._2d}]{.ff6 .fs4 .fc3 .lsf}Circle[ ]{._ ._2f}([]{._ ._26})[ ]{._
._22};]{.fs8 .lsb}

</div>

<div class="t m0 xe h14 y138 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._47}[d.[]{._ ._2b}s[]{._ ._48}e[]{._ ._0}t[]{._ ._0}R[]{._
._0}a[]{._ ._0}d[]{._ ._0}i[]{._ ._0}u[]{._ ._0}s[]{._ ._30}(c[]{._
._30}.[]{._ ._2b}g[]{._ ._48}e[]{._ ._48}t[]{._ ._0}R[]{._ ._0}a[]{._
._48}d[]{._ ._0}i[]{._ ._0}u[]{._ ._48}s[]{._ ._2b}()[]{._ ._2b})[ ]{._
._2f};]{.fs8 .ls33}

</div>

<div class="t m0 xe ha y139 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._24}[// [c[ ]{._ ._2b}'[]{._ ._30}s[ ]{._ ._2d}[radius[ ]{._
._e}copied[ ]{._ ._e}[into[ ]{._ ._e}]{.ls13}]{.ls9}d[]{._ ._30}'[]{._
._2b}s[ ]{._ ._2a}[radius]{.ls35}]{.ls0}]{.ff7 .fs4 .fc2 .lsc}

</div>

<div class="t m0 xe h14 y13a ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._47}[d.[]{._ ._2b}s[]{._ ._48}e[]{._ ._0}t[]{._ ._0}R[]{._
._0}a[]{._ ._0}d[]{._ ._0}i[]{._ ._0}u[]{._ ._0}s[]{._ ._30}([]{._
._3}2[]{._ ._0}0)[]{._ ._2b};]{.fs8 .ls33}

</div>

<div class="t m0 xe h14 y13b ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[System[ ]{._ ._37}.[ ]{._ ._37}ou t[ ]{._ ._37}.[ ]{._
._8}p[]{._ ._2b}r[]{._ ._30}i[]{._ ._2b}n[]{._ ._30}t[]{._ ._2b}l[]{._
._30}n[ ]{._ ._8}([ ]{._ ._2b}c[ ]{._ ._37}.[ ]{._ ._22}g e t R a d i u
s[ ]{._ ._37}([ ]{._ ._2b})[ ]{._ ._d})[ ]{._ ._8};[ ]{._ ._49}[//
??]{.ff7 .fs4 .fc2 .lsc}]{.fs8 .ls34}

</div>

<div class="t m0 x2c h4 y13c ff3 fs1 fc0 sc0 ls0 ws0">

c

</div>

<div class="t m0 x2d h4 y13d ff3 fs1 fc0 sc0 ls0 ws0">

radius=30

</div>

<div class="t m0 x1d h4 y13e ff3 fs1 fc0 sc0 ls0 ws0">

d[ ]{._ ._4a}radius=30

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

22

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf17" class="pf w0 h0" data-page-no="17">

<div class="pc pc17 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAAMkCAIAAAAakQdkAAAACXBIWXMAABYlAAAWJQFJUiTwAAASyElEQVR42u3dT2hcdQLA8fdmJhhrOx0CXjK2kLGtkBZUIqzpQbvUSkHs1lSKHoSK7EUhu6cq6DGLizYXix7cQ8U9KCUlumW1Kx1WEKtlGdGaBKr9QyIzZImEdgZL2m3y9vC6Y63LXgyT99t+Pqf3Jodf+P3m8OX3m5kXJ0kSXWdxcXFubm5ycnJqaurixYsRAAAranBwsK+vr7e3t7u7+/rX4+sz7uTJk6+88sr8/Lz5AgDImuHh4V27duXz+Z9k3OLi4ssvv1ytVk0QAEBmVSqV0dHRUqn0Y8aNjIy0Gy6Xy23o37Bn354tA1tMFgDACpo5O3P0naOf//3zpaWldsm9+eab+Xw+TpLk5MmTL7zwQhpw23dt3/3U7lJPyawBAGTH2KGx4+8fb11sRVE0PDz82GOPxVevXt27d2/6ebgdu3fs+90+0wQAkEEnqideH3k9vR4fH8/Nzc21v9Ow+6ndJggAIJu2bt96S/ct6XWtVstNTk6mN5u2bHKWCgCQZQ/sfCC9mJqayk1NTaU3e/btMTUAAFnWPjv98ssvc+3f+PW9VACAjGufnZ47dy5nOgAAQiTjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAA/HIFUwDZ1/tw2STQeY2P6iYBssxuHACAjAMAQMYBACDjAABkHAAAMg4AABkHAHAT8btxEDA/68Wy8MOEECi7cQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAH65gimAcPU+XDYJADctu3EAADIOAAAZBwCAjAMAkHEAAMg4AABkHADATcTvxkEAGh/VTQIAN7AbBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjTAEAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAP6LQlj/7qUfLm1cvdGyAQBZVk/qMu5Gq25bFUVR0mx6fwAA2RQXi50ZyKEqAECQZBwAgIwDAEDGAQAg4wAA/t8UgvuP60m9EbWsHACQ2VbpzEB24wAAgiTjAABkHAAAnRLeZ+PKcdlTHACAzIqLxc58PM5uHABAkGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAAAsu/AexjV9ZbrR1bJyAEBmW6UzA4W3G1foKnh/AABaxaEqAECQZBwAgIwDAKBTwvucWTkuJ82mlQMAsikuFutJvQMD2Y0DAAiSjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AgGUX3sO46km9EbWsHACQ2VbpzEB24wAAgiTjAACCFN6hajkuJ82mlQMAsikuFjtzrmo3DgAgSDIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AACWXXgP4zrT+raxumXlAIDMtkpnBgpvN+7W1au8PwAAreJQFQAgSDIOACBI4X02rhyXk2bTygEA2RQXi/Wk3oGB7MYBAARJxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAwLIL72Fc01emG10tKwcAZLZVOjNQeLtxha6C9wcAoFUcqgIABEnGAQAEKbwDynJcTppNKwcAZFNcLNaTegcGshsHABAkGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AgP8oBPcfT1+ZbnS1rBwAkNlW6cxA4e3GFboK3h8AgFZxqAoAECQZBwAQpPAOKMtxOWk2rRwAkE1xsVhP6h0YyG4cAECQZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAACy78B7GNX1lutHVsnIAQGZbpTMDhbcbV+gqeH8AAFrFoSoAQJBkHACAjAMAoFPC+5xZOS4nzaaVAwCyKS4W60m9AwPZjQMACJKMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgCAZRfew7jqSb0RtawcAJDZVunMQHbjAACCJOMAAIIU3qFqOS4nzaaVAwCyKS4WO3OuajcOACBIMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAJZdeA/jOtP6trG6ZeUAgMy2SmcGCm837tbVq7w/AACt4lAVACBIMg4AIEjhfTauHJeTZtPKAQDZFBeL9aTegYHsxgEABEnGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwDAsgvvYVzTV6YbXS0rBwBktlU6M1B4u3GFroL3BwCgVRyqAgAEScYBAAQpvAPKclxOmk0rBwBkU1ws1pN6BwayGwcAECQZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAyy68h3HVk3ojalk5ACCzrdKZgezGAQAEScYBAAQpvEPVclxOmk0rBwBkU1wsduZc1W4cAECQZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAGVEI69+99MOlKIriYtHKAQAyLiSrbls1/a/pQqFg5QCAbLp69WpnBgrvUFXDAQBaJfLZOACAQMk4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAD8PONmzs6YDgCAIPT09OQGBwfTm6PvHDUjAABZduzIsfTi3nvvzfX19aU3tU9rpgYAIMs+/uvH6cXg4GCut7c3vbm8cHns0JjZAQDIppmzM9+d/y697uvry3V3dw8NDaX3x98/7hNyAAAZdGH+wht/eCO9HhgYqFQqcZIki4uLe/funZ+fT/+wrm/dtke27dyz03wBAKy4idrEkbeOfDPxTfuV8fHxUqkUJ0kSRdHs7Oxzzz3XLrkoim7pvmXN2jUmDgBgBV1euNy62Lr+lYMHD27ZsiWKomsZF0XRwsLCgQMHqtWq+QIAyKBKpTI6OloqldLbHzMuNTEx8cUXX5w6dapW88VVAIBM1NuDDz5411133Xffffl8vv36jRkHAEAQPIwLAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AAA6pvDzlxYXF+fm5iYnJ80OAMCK6+vr6+3t7e7u/l8ZNzs7++KLL547d858AQBkSk9Pz6uvvlqpVNqvxEmSpFfj4+OvvfaaOQIAyKyhoaFnn302n8//mHE3NNyaNWsfeug3vb3rTRYAwApqNGY++eRv33//z/YrAwMDBw4cuJZxs7OzTz75ZPqHTZu27Nixe+vW7WYNACAjZmbOvvvun77++h9LS0tRFL300kvbt2+PkyR55pln0s/D3X33r/bv/6OZAgDIoLGxQ+Pjb6fXH374YW52drb9nYYnnvitCQIAyKbHH386l7v2a3FfffVVbnp6Or1Zt65v/fo7TRAAQGbdf/+v04vTp0/nTp8+nd5s2/aIqQEAyLJHH732fYZTp07lZmZm0pudO/eYGgCALGufndZqNQ/jAgAIkowDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDALj5Mm7t2rXp1cREzXQAAGTZhQvz6UWlUsn19/enN0eOvGVqAACy7Pjx99OLe+65J7d58+b05syZqXbfAQCQQR98cDi96O/vz91+++09PT1RFC0tLb333p/NDgBANp04Ub18eSG9HhgYyOXz+f3796f31epfxsYO2ZMDAMiaY8eOvP32wfR6aGioVCrFSZJEUTQyMlKtVtM/5HK5DRv6n3769+vX32nKAABW0MzM2aNH36nVPm3vw/X09Bw+fDifz1/LuMXFxeeff75W82VVAIDsqlQqo6OjpVIpiqJrGZeqVqsjIyMmCAAgg4aHh3ft2pXP59Pbn2RcFEULCwuNRuP8+fOfffaZyQIAWHGbN2/euHHjHXfckW7Ctf0bNtxvA8uFfTUAAAAASUVORK5CYII=){.bi
.xf .y13f .w2 .h22}
<div class="t m0 x10 he y42 ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}6

</div>

<div class="t m0 x2a he y43 ff9 fs1 fc5 sc0 ls0 ws0">

Create[ ]{._ ._18}a[ ]{._ ._28}deep[ ]{._ ._18}copy

</div>

<div class="t m0 x12 hf y44 ffa fs1 fc0 sc0 ls8 ws0">

Create[ ]{._ ._18}a[ ]{._ ._18}deep[ ]{._ ._18}copy[ ]{._ ._49}of[ ]{._
._38}[myObj[ ]{._ ._29}]{.ff9 .fc2 .ls0}into[ ]{._ ._29}[yourObj[ ]{._
._18}]{.ff9 .fc2 .ls0}[.]{.ls0}

</div>

<div class="t m0 x12 hf y78 ffa fs1 fc0 sc0 ls8 ws0">

Increase[ ]{._ ._18}the[ ]{._ ._18}radius[ ]{._ ._49}of[ ]{._
._38}[yourObj[ ]{._ ._29}]{.ff9 .fc2 .ls0}by[ ]{._ ._18}2.[ ]{._
._29}What[ ]{._ ._18}is

</div>

<div class="t m0 x12 hf y123 ffa fs1 fc0 sc0 ls8 ws0">

the[ ]{._ ._18}new[ ]{._ ._18}radius[ ]{._ ._18}of[ ]{._ ._29}[myObj[
]{._ ._18}]{.ff9 .fc2 .ls0}[?]{.ls0}

</div>

<div class="t m0 x13 h9 y124 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Circle[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y125 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._3d}[private[ ]{._ ._1f}double[ ]{._ ._1f}[radius;]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y126 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._3d}[//[assume[ ]{._ ._1f}getters[,[ ]{._
._1f}]{.ls0}setters]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y127 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._3d}[//[ ]{._ ._1f}[and[ ]{._ ._1f}]{.ls2}constructors[ ]{._
._1f}[defined]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y128 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 h15 y129 ff3 fs3 fc0 sc0 ls0 ws0">

6

</div>

<div class="t m0 x13 h9 y12a ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[class[ ]{._ ._1f}[Client[ ]{._ ._1f}{]{.ff7 .fc0}]{.ff6
.fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y12b ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._3d}[public[ ]{._ ._1f}static[ ]{._ ._1f}[void[ ]{._
._1f}]{.ls3}[main(String\[\][ ]{._ ._1e}args)[ ]{._ ._1f}{]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y12c ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._3e}[Circle[ ]{._ ._1f}myObj[ ]{._ ._1f}=[ ]{._ ._1e}[new[ ]{._
._1f}]{.ff6 .fc3}Circle(1.5);]{.ff7 .fs4 .ls2}

</div>

<div class="t m0 x12 ha y12d ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._3e}[//[your[ ]{._ ._1f}code]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x12 ha y12e ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._3d}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 ha y12f ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y130 ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._49}here

</div>

<div class="t m0 x12 hf y131 ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[6]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

23

</div>

[](#pf1b){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:395.764000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf18" class="pf w0 h0" data-page-no="18">

<div class="pc pc18 w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAAR5CAIAAABvJiLDAAAACXBIWXMAABYlAAAWJQFJUiTwAAAXEUlEQVR42u3dQWhUdx7A8f+bRJK1djYEoSGpE4zVga21helWcC+FaKkuVbFsqOwutJS9CO0uqKWwHiMVmsJSqZc9uBdp6aph66FuadiFUlMP05Zicqg6wdgZWpQhTojE0vj28GSq2T1ts5P3tp/P6f9eQ1/4vRy+/N84L4rjONxlbm5u1apVAQCA/4FF6fVDRP/+/4qiKG40TBkAYGlF+fwSZlzOQAEAskjGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4IwAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAIC0a190PDc3F0KI8nmjAQBIsyiOY1MAAMgcD1UBAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAA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){.bi
.xf .y140 .w2 .h23}
<div class="t m0 x7 h17 y6b ff1 fs6 fc0 sc0 ls0 ws0">

8.3[ ]{._ ._e}Copy[ ]{._ ._8}constructor

</div>

<div class="t m0 xe hb y141 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._24}[public[ ]{._ ._17}class[ ]{._ ._17}[Circle[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y142 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._46}[private[ ]{._ ._17}double[ ]{._ ._17}[radius;]{.ff7
.fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y143 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._46}[//[setters[,[ ]{._ ._17}]{.ls0}getters]{.ls5}]{.ff7 .fs5
.fc2 .ls6}

</div>

<div class="t m0 xe h15 y144 ff3 fs3 fc0 sc0 ls0 ws0">

4

</div>

<div class="t m0 xe hb y145 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._46}[public[ ]{._ ._17}[Circle(]{.ff7 .fc0}double[ ]{._
._17}[radius)[ ]{._ ._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y146 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._4b}[setRadius(radius);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc y147 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._46}[}]{.ff7 .fs5}

</div>

<div class="t m0 xe h15 y148 ff3 fs3 fc0 sc0 ls0 ws0">

8

</div>

<div class="t m0 xe hb y149 ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._46}[public[ ]{._ ._17}[Circle(Circle[ ]{._ ._17}other)[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 x7 hc y14a ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._4b}[setRadius(other.radius);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 x7 hc y14b ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._46}[}]{.ff7 .fs5}

</div>

<div class="t m0 x7 hc y14c ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._24}[}]{.ff7 .fs5}

</div>

<div class="t m0 x10 he y14d ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}7

</div>

<div class="t m0 x1d he y14e ff9 fs1 fc5 sc0 ls0 ws0">

Define[ ]{._ ._18}a[ ]{._ ._28}copy[ ]{._ ._18}constructor

</div>

<div class="t m0 x12 hf y14f ffa fs1 fc0 sc0 ls8 ws0">

Define[ ]{._ ._18}a[ ]{._ ._18}copy[ ]{._ ._18}constructor[ ]{._
._49}in[ ]{._ ._18}class[ ]{._ ._38}[Rectangle[ ]{._ ._49}]{.ff9 .fc2
.ls0}[.]{.ls0}

</div>

<div class="t m0 x13 h9 y150 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Rectangle[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y151 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._3d}[private[ ]{._ ._1f}double[ ]{._ ._1f}[width,[ ]{._
._1f}height;]{.ff7 .fc0 .ls3}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y152 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._3d}[//[assume[ ]{._ ._1f}getters[,[ ]{._ ._1f}]{.ls0}setters[
]{._ ._1f}defined]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y153 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._3d}[//[define[ ]{._ ._1f}copy[ ]{._ ._1f}constructor[ ]{._
._1f}he[]{._ ._26}re]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 ha y154 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y155 ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._49}here

</div>

<div class="t m0 x12 hf y156 ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[7]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

24

</div>

[](#pf1c){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:258.035000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf19" class="pf w0 h0" data-page-no="19">

<div class="pc pc19 w0 h0">

![](data:image/png;base64,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){.bi
.xf .y157 .w2 .h24}
<div class="t m0 x7 h7 y158 ff1 fs2 fc0 sc0 ls0 ws0">

8.3.1[ ]{._ ._17}Cop[]{._ ._3}y[ ]{._ ._22}constructor[ ]{._ ._8}call

</div>

<div class="t m0 xe hb y159 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._24}[Circle[ ]{._ ._17}c[ ]{._ ._17}=[ ]{._ ._17}[new[ ]{._
._17}]{.ff6 .fc3 .ls6}Circle(30);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hb y15a ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._24}[Circle[ ]{._ ._17}d[ ]{._ ._17}=[ ]{._ ._17}[new[ ]{._
._17}]{.ff6 .fc3 .ls6}Circle(c);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 x10 he y15b ff9 fs1 fc0 sc0 ls0 ws0">

Exercise[ ]{._ ._27}8

</div>

<div class="t m0 x2f he y15c ff9 fs1 fc5 sc0 ls0 ws0">

Call[ ]{._ ._18}a[ ]{._ ._28}copy[ ]{._ ._18}constructor

</div>

<div class="t m0 x12 hf y15d ffa fs1 fc0 sc0 ls8 ws0">

Deep[ ]{._ ._18}copy[ ]{._ ._29}[myObj[ ]{._ ._29}]{.ff9 .fc2 .ls0}into[
]{._ ._38}[yourObj[ ]{._ ._29}]{.ff9 .fc2 .ls0}using[ ]{._ ._49}the[
]{._ ._18}copy

</div>

<div class="t m0 x12 hf y15e ffa fs1 fc0 sc0 ls8 ws0">

constructor[ ]{._ ._18}defined[ ]{._ ._18}in[ ]{._ ._49}class[ ]{._
._38}[Square[ ]{._ ._49}]{.ff9 .fc2 .ls0}[.]{.ls0}

</div>

<div class="t m0 x13 h9 y15f ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._1f}class[ ]{._ ._1f}[Square[ ]{._
._1f}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 h9 y160 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._3d}[private[ ]{._ ._1f}double[ ]{._ ._1f}[side;]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y161 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._3d}[//[assume[ ]{._ ._1f}getters[,[ ]{._ ._1f}]{.ls0}setters[
]{._ ._1f}defined]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x13 h9 y162 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._3d}[public[ ]{._ ._1f}[Square(Square[ ]{._ ._1f}other)[ ]{._
._1e}{]{.ff7 .fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x13 ha y163 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._3e}[setSide(other.side);]{.ff7 .fs4 .ls2}

</div>

<div class="t m0 x13 ha y164 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._3d}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 ha y165 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x13 h15 y166 ff3 fs3 fc0 sc0 ls0 ws0">

8

</div>

<div class="t m0 x13 h9 y167 ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._5}[class[ ]{._ ._1f}[Client[ ]{._ ._1f}{]{.ff7 .fc0}]{.ff6
.fs4 .fc3 .ls2}

</div>

<div class="t m0 x12 h9 y168 ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._3d}[public[ ]{._ ._1f}static[ ]{._ ._1f}[void[ ]{._
._1f}]{.ls3}[main(String\[\][ ]{._ ._1e}args)[ ]{._ ._1f}{]{.ff7
.fc0}]{.ff6 .fs4 .fc3 .ls2}

</div>

<div class="t m0 x12 h9 y169 ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._3e}[Square[ ]{._ ._1f}myObj[ ]{._ ._1f}=[ ]{._ ._1e}[new[
]{._ ._1f}]{.ff6 .fc3}Square(2.4);]{.ff7 .fs4 .ls2}

</div>

<div class="t m0 x12 ha y16a ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._3e}[//[your[ ]{._ ._1f}code]{.ls2}]{.ff7 .fs4 .fc2 .ls3}

</div>

<div class="t m0 x12 ha y16b ff3 fs3 fc0 sc0 ls0 ws0">

13[ ]{._ ._3d}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 ha y16c ff3 fs3 fc0 sc0 ls0 ws0">

14[ ]{._ ._5}[}]{.ff7 .fs4}

</div>

<div class="t m0 x12 hf y16d ffa fs1 fc0 sc0 ls8 ws0">

Write[ ]{._ ._18}your[ ]{._ ._18}answer[ ]{._ ._49}here

</div>

<div class="t m0 x12 hf y16e ffa fs1 fc0 sc0 ls0 ws0">

([SOLUTION[ ]{._ ._2a}[8]{.fc1}]{.ff9 .fs6})

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

25

</div>

[](#pf1c){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:178.665000px;bottom:300.410000px;width:8.269000px;height:13.054000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf1a" class="pf w0 h0" data-page-no="1a">

<div class="pc pc1a w0 h0">

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAA0IAAARfCAIAAAC+08ToAAAACXBIWXMAABYlAAAWJQFJUiTwAAART0lEQVR42u3ZoW7EMBBFUU8VaPn/vzPrwVMQNWBpnapuz0GDDB66ktucswEAsJ2qMgIAwHZCxgEA7OjDBAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAf9ac0wgAANuJqrICAMB2fKoCAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAsJFj+YuZ2Xu3LADAE6rqOuK+FoqIOk8rAwAsrqwx7njzqQoAsCUZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjTAAAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAPxfx/IXM7O1FmMYFwDgOVFVVgAA2I5PVQAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAyDgAABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAMBvcSx/MTN775YFAHhCVV1H3NdCEVHnaWUAgMWVNcYdbz5VAQC2JOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAZJwJAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAZBwAgIwDAOAnHctfzMzWWoxhXACA50RVWQEAYDs+VQEAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AAAZBwCAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAABkHAICMAwBAxgEAIOMAAGQcAAAyDgAAGQcAIOMAAJBxAADIOAAAGQcAgIwDAEDGAQAg4wAAZBwAADIOAAAZBwAg4wAAkHEAAMg4AABkHACAjAMAQMYBACDjAABkHAAAMg4AABkHACDjAACQcQAAyDgAAGQcAICMAwBAxgEAIOMAAGQcAAAyDgCAbziWv5iZvXfLAgA8oaquI+5roYio87QyAMDiyhrjjjefqgAAW5JxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAQMYBAMg4AABkHAAAMg4AQMYBACDjAACQcQAAMg4AABkHAICMAwBAxgEAyDgAAGQcAAAyDgBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAEDGAQDIOAAAZBwAADIOAEDGAQAg4wAAkHEAADLOBAAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAJBxAAAyDgAAGQcAgIwDAJBxAADIOAAAZBwAgIwDAEDGAQAg4wAAkHEAADIOAAAZBwCAjAMAkHEAAMg4AABkHACAjAMAQMYBACDjAACQcQAAMg4AABkHAICMAwCQcQAAyDgAAGQcAICMAwBAxgEAIOMAAHhzPPHofL1a78YFAFhfWV8+AbmZViIU7U5gAAAAAElFTkSuQmCC){.bi
.x7 .y16f .w2 .h25}
<div class="t m0 x7 h3 y24 ff4 fs1 fc0 sc0 ls0 ws0">

Section[ ]{._ ._2}9.

</div>

<div class="t m0 x30 h3 y25 ff4 fs1 fc0 sc0 ls0 ws0">

Sample[ ]{._ ._2}solutions[ ]{._ ._4}for[ ]{._ ._2}exer[]{._ ._0}cises

</div>

<div class="t m0 xb h26 y170 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[1]{.fc1}

</div>

<div class="t m0 xe hb y171 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._17}class[ ]{._ ._17}[Square[ ]{._
._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y172 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._24}[private[ ]{._ ._17}double[ ]{._ ._17}[side;]{.ff7
.fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y173 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._24}[public[ ]{._ ._17}[void[ ]{._ ._17}]{.ls6}[setSide(]{.ff7
.fc0}double[ ]{._ ._17}[side)[ ]{._ ._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 xe hb y174 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._25}[this[.side[ ]{._ ._17}[=M[]{._ ._4c}a[]{._ ._4c}t[]{._
._4c}h[]{._ ._4c}.[]{._ ._4d}m[]{._ ._4d}a[]{._ ._4c}x[]{._ ._4c}([]{._
._4c}0[]{._ ._4d},s[]{._ ._4c}i[]{._ ._4c}d[]{._ ._4c}e[]{._ ._4d})[]{._
._4c};]{.fc0 .ls36}]{.ff7 .fc4 .ls7}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y175 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._24}[}]{.ff7 .fs5}

</div>

<div class="t m0 xe hc y176 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._24}[//[assume[ ]{._ ._17}getter[ ]{._ ._17}]{.ls5}is[ ]{._
._17}[also[ ]{._ ._17}defined]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hc y177 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 xb h26 y178 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[2]{.fc1}

</div>

<div class="t m0 xe hb y179 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._17}[int[ ]{._ ._17}]{.ls6}[compareTo(Square[
]{._ ._17}other)[ ]{._ ._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hb y17a ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._46}[if[(area()[ ]{._ ._17}&gt;[ ]{._ ._17}other.area())]{.ff7
.fc0 .ls7}]{.ff6 .fs5 .fc3 .ls6}

</div>

<div class="t m0 xe hb y17b ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._4b}[return[ ]{._ ._17}[1;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 xe hb y17c ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._46}[if[(area()[ ]{._ ._17}&lt;[ ]{._ ._17}other.area())]{.ff7
.fc0 .ls7}]{.ff6 .fs5 .fc3 .ls6}

</div>

<div class="t m0 xe hb y17d ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._4b}[return[ ]{._ ._17}[-1;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 xe hc y17e ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._46}[//in[ ]{._ ._17}[all[ ]{._ ._17}other[ ]{._
._17}cases[:]{.ls0}]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hb y17f ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._46}[return[ ]{._ ._17}[0;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 xe hc y180 ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 xb h26 y181 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[3]{.fc1}

</div>

<div class="t m0 xe hb y182 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._17}[int[ ]{._
._17}]{.ls6}[compareTo(Rectangle[ ]{._ ._17}other)[ ]{._ ._17}{]{.ff7
.fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y183 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._46}[//[first[ ]{._ ._17}key[ ]{._ ._17}comparison]{.ls5}]{.ff7
.fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hb y184 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._46}[if[(area()[ ]{._ ._17}&gt;[ ]{._ ._17}other.area())]{.ff7
.fc0 .ls7}]{.ff6 .fs5 .fc3 .ls6}

</div>

<div class="t m0 xe hb y185 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._4b}[return[ ]{._ ._17}[1;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 xe hb y186 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._46}[if[(area()[ ]{._ ._17}&lt;[ ]{._ ._17}other.area())]{.ff7
.fc0 .ls7}]{.ff6 .fs5 .fc3 .ls6}

</div>

<div class="t m0 xe hb y187 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._4b}[return[ ]{._ ._17}[-1;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 xe h15 y188 ff3 fs3 fc0 sc0 ls0 ws0">

7

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

26

</div>

[](#pf6){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:625.888000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfa){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:463.336000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pfd){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:284.525000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf1b" class="pf w0 h0" data-page-no="1b">

<div class="pc pc1b w0 h0">

![](data:image/png;base64,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AABiCwBAbAEAiC0AAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAgNgCAEBsAQCILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAgNgCABBbAABiCwAAsQUAILYAAMQWAABiCwBAbAEAiC0AAMQWAIDYAgAQWwAAiC0AALEFACC2AAAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBAIgtAADEFgCA2AIAEFsAAIgtAACxBQAgtgAAEFsAAGILAEBsAQAgtgAAxBYAAGILAEBsAQCILQAAxBYAgNgCABBbAACILQAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALFlAgAAsQUAILYAABBbAABiCwBAbAEAILYAAMQWAIDYAgBAbAEAiC0AALEFAIDYAgAQWwAAYgsAALEFACC2AADEFgAAYgsAQGwBACC2AADEFgCA2AIAQGwBAIgtAACxBQCA2AIAEFsAAGILAACxBQAgtgAAxBYAAGIL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){.bi
.x17 .y16f .w3 .h27}
<div class="t m0 xe hc y189 ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._46}[//[second[ ]{._ ._17}key[ ]{._
._17}comparison]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hb y18a ff3 fs3 fc0 sc0 ls0 ws0">

9[ ]{._ ._46}[if[(perimeter()[ ]{._ ._17}&gt;[ ]{._
._17}other.perime[]{._ ._26}ter())]{.ff7 .fc0 .ls7}]{.ff6 .fs5 .fc3
.ls6}

</div>

<div class="t m0 x7 hb y18b ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._4b}[return[ ]{._ ._17}[1;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 x7 hb y18c ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._46}[if[(perimeter()[ ]{._ ._17}&lt;[ ]{._
._17}other.perime[]{._ ._26}ter())]{.ff7 .fc0 .ls7}]{.ff6 .fs5 .fc3
.ls6}

</div>

<div class="t m0 x7 hb y18d ff3 fs3 fc0 sc0 ls0 ws0">

12[ ]{._ ._4b}[return[ ]{._ ._17}[-1;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 x7 h15 y18e ff3 fs3 fc0 sc0 ls0 ws0">

13

</div>

<div class="t m0 x7 hc y18f ff3 fs3 fc0 sc0 ls0 ws0">

14[ ]{._ ._46}[//[still[ ]{._ ._17}nothing[?]{.ls0}]{.ls5}]{.ff7 .fs5
.fc2 .ls6}

</div>

<div class="t m0 x7 hb y190 ff3 fs3 fc0 sc0 ls0 ws0">

15[ ]{._ ._46}[return[ ]{._ ._17}[0;]{.ff7 .fc0 .ls6}]{.ff6 .fs5 .fc3
.ls5}

</div>

<div class="t m0 x7 hc y191 ff3 fs3 fc0 sc0 ls0 ws0">

16[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 xb h26 y192 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[4]{.fc1}

</div>

<div class="t m0 xe hc y193 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[//[instance[ ]{._ ._17}variable[ ]{._ ._17}called[ ]{._
._17}]{.ls5}on[ ]{._ ._17}[object]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hc y194 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._5}[System.out.println(obj.data1);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe h15 y195 ff3 fs3 fc0 sc0 ls0 ws0">

3

</div>

<div class="t m0 xe hc y196 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._5}[//[static[ ]{._ ._17}variable[ ]{._ ._17}called[ ]{._
._17}]{.ls5}on[ ]{._ ._17}[class]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hc y197 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._5}[System.out.println(MyClass.data2);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe h15 y198 ff3 fs3 fc0 sc0 ls0 ws0">

6

</div>

<div class="t m0 xe hc y199 ff3 fs3 fc0 sc0 ls0 ws0">

7[ ]{._ ._5}[//[static[ ]{._ ._17}method[ ]{._ ._17}called[ ]{._
._17}]{.ls5}on[ ]{._ ._17}[class]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 xe hc y19a ff3 fs3 fc0 sc0 ls0 ws0">

8[ ]{._ ._5}[System.out.println(MyClass.method1());]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe h15 y19b ff3 fs3 fc0 sc0 ls0 ws0">

9

</div>

<div class="t m0 x7 hc y19c ff3 fs3 fc0 sc0 ls0 ws0">

10[ ]{._ ._5}[//[instance[ ]{._ ._17}method[ ]{._ ._17}called[ ]{._
._17}]{.ls5}on[ ]{._ ._17}[object]{.ls5}]{.ff7 .fs5 .fc2 .ls6}

</div>

<div class="t m0 x7 hc y19d ff3 fs3 fc0 sc0 ls0 ws0">

11[ ]{._ ._5}[System.out.println(obj.method2());]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xb h26 y19e ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[5]{.fc1}

</div>

<div class="t m0 xe hc y19f ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[Circle[ ]{._ ._17}yourObj[ ]{._ ._17}=[ ]{._ ._17}myObj;[
]{._ ._17}[//[shallow[ ]{._ ._17}]{.ls5}copy]{.fc2 .ls6}]{.ff7 .fs5
.ls5}

</div>

<div class="t m0 xe hc y1a0 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._5}[youObj.setRadius(yourObj.getRadius()[ ]{._ ._17}+[ ]{._
._17}2);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc y1a1 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._5}[System.out.println(myObj.getRadius());[ ]{._ ._17}[//[will[
]{._ ._17}]{.ls6}be[ ]{._ ._17}[3.5]{.ls6}]{.fc2}]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xb h26 y1a2 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[6]{.fc1}

</div>

<div class="t m0 xe hc y184 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[//[create[ ]{._ ._17}[a[ ]{._
._17}]{.ls0}]{.ls5}brand[-[spanking[ ]{._ ._17}new[ ]{._ ._17}object[
]{._ ._17}]{.ls5}]{.ls0}in[ ]{._ ._17}[memory]{.ls5}]{.ff7 .fs5 .fc2
.ls6}

</div>

<div class="t m0 xe hb y185 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._5}[Circle[ ]{._ ._17}yourObj[ ]{._ ._17}=[ ]{._ ._17}[new[
]{._ ._17}]{.ff6 .fc3 .ls6}Circle();]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc y186 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._5}[//[get[ ]{._ ._17}the[ ]{._ ._17}value[ ]{._ ._17}for[ ]{._
._17}radius[ ]{._ ._17}from[ ]{._ ._17}myObj]{.ls5}]{.ff7 .fs5 .fc2
.ls6}

</div>

<div class="t m0 xe hc y187 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._5}[yourObj.setRadius(myObj.getRadius());]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc y188 ff3 fs3 fc0 sc0 ls0 ws0">

5[ ]{._ ._5}[youObj.setRadius(yourObj.getRadius()[ ]{._ ._17}+[ ]{._
._17}2);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

27

</div>

[](#pf12){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:574.669000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf15){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:348.087000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf17){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:251.576000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

<div id="pf1c" class="pf w0 h0" data-page-no="1c">

<div class="pc pc1c w0 h0">

![](data:image/png;base64,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){.bi
.x17 .y1a3 .w3 .h28}
<div class="t m0 xe hc y189 ff3 fs3 fc0 sc0 ls0 ws0">

6[ ]{._ ._5}[System.out.println(myObj.getRadius());[ ]{._ ._17}[//[will[
]{._ ._17}still[ ]{._ ._17}]{.ls6}be[ ]{._ ._17}[1.5]{.ls6}]{.fc2}]{.ff7
.fs5 .ls5}

</div>

<div class="t m0 xb h26 y1a4 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[7]{.fc1}

</div>

<div class="t m0 xe hb y1a5 ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[public[ ]{._ ._17}[Rectangle(Rectangle[ ]{._ ._17}source)[
]{._ ._17}{]{.ff7 .fc0}]{.ff6 .fs5 .fc3 .ls5}

</div>

<div class="t m0 xe hc y1a6 ff3 fs3 fc0 sc0 ls0 ws0">

2[ ]{._ ._46}[setWidth(source.getWidth());]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc y1a7 ff3 fs3 fc0 sc0 ls0 ws0">

3[ ]{._ ._46}[setHeight(source.getHeight());]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 xe hc y1a8 ff3 fs3 fc0 sc0 ls0 ws0">

4[ ]{._ ._5}[}]{.ff7 .fs5}

</div>

<div class="t m0 xb h26 y1a9 ff2 fs2 fc0 sc0 ls0 ws0">

Solution:[ ]{._ ._2}Ex[]{._ ._3}er[]{._ ._3}cise[ ]{._ ._8}[8]{.fc1}

</div>

<div class="t m0 xe hb y1aa ff3 fs3 fc0 sc0 ls0 ws0">

1[ ]{._ ._5}[Square[ ]{._ ._17}yourObj[ ]{._ ._17}=[ ]{._ ._17}[new[
]{._ ._17}]{.ff6 .fc3 .ls6}Square(myObj);]{.ff7 .fs5 .ls5}

</div>

<div class="t m0 x1e h5 y6 ff3 fs2 fc0 sc0 ls0 ws0">

28

</div>

[](#pf18){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:703.198000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

[](#pf19){.l}
<div class="d m1"
style="border-style:none;position:absolute;left:340.392000px;bottom:587.727000px;width:8.102000px;height:10.349000px;background-color:rgba(255,255,255,0.000001);">

</div>

</div>

<div class="pi"
data-data="{&quot;ctm&quot;:[1.000000,0.000000,0.000000,1.000000,0.000000,0.000000]}">

</div>

</div>

</div>

<div class="loading-indicator">

![](data:image/png;base64,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)

</div>
