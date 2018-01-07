(function($){
	var Page ={}
	
	 Page.Event={
			reqUrl:{
			'get':'/login'	
			},
			init:function(){
				this.picHoverChangeOpacity();
			},
			/**
			 * 当鼠标停在图片上的时候，改变透明度
			 */
		picHoverChangeOpacity:function(){
			$('#top10project').on('mouseenter','img',function(event){
				$(this).addClass('hoverd');
			})
			$('#top10project').on('mouseleave','img',function(event){
				$(this).removeClass('hoverd');
			})
		}
	}
	Page.Event.init();
})(jQuery);