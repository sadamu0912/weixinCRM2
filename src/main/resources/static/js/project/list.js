(function($){
	var Page ={}
	
	 Page.Event={
			reqUrl:{
			'get':'/login'	
			},
			init:function(){
				this.picHoverChangeOpacity();
				this.changeSort();
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
		},
		/**
		 * 点击图标改变排序的顺序
		 */
		changeSort:function(){
			$('.main-content').on('click','.canOrderTHead',function(event){
				var icon = $(this).find('i');
				if(icon.hasClass('fa-sort-up')){
					icon.removeClass('fa-sort-up').addClass('fa-sort-desc');
					
				}else if(icon.hasClass('fa-sort-desc')){
					icon.removeClass('fa-sort-desc').addClass('fa-sort-up');	
				}
				
			})
		}
	}
	Page.Event.init();
})(jQuery);