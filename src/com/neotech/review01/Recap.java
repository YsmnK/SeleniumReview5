package com.neotech.review01;

public class Recap {
//	<html>
//	<body>
//
//		<div id="division-a">
//		</div>
//
//		<div id="division-b">
//			<div>
//				<a></a>
//			</div>
//		</div>
//        
//		<div id="division-c">
//            <a></a>
//		</div>
//
//		<div class="mango" />
//
//		<input id="james" />
//        
//	</body>
//</html>
//
//--------------------------------
//xpath
//--------------------------------
//*** Absolute - Full path
///html/body/div[2]
//
//*** Relative - Shorter path
////div[@id='division-b']
//
//--------------------------------
//*** one forward slash means direct child ( /div/a )
////div[@id='division-b']/div/a
//
//*** two forward slashes means direct or indirect child ( //a )
////div[@id='division-b']//a
//
//--------------------------------
//xpath vs css
//--------------------------------
//*** input with id james
//xpath -> //input[@id='james']
//css -> input#james
//
//*** any tag with class mango
//xpath -> //*[@class='mango']
//css -> .mango
//
//xpath -> //div[@id='division-b']/div/a
//css -> div#division-b > div > a
//	

}
