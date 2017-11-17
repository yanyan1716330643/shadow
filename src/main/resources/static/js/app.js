$(function(){
	$('.prev-slide').on('click',function(){
		$('#slideshow').carousel('prev');
	});
	$('.next-slide').on('click',function(){
		$('#slideshow').carousel('next');
	});
	$(document).on('keydown',function(e){
		console.log(e.which);
		switch(e.which){
			case 37:
				$('#slideshow').carousel('prev');
			case 39:
				$('#slideshow').carousel('next');
		}
	});

	var play = false;
	$('.play-and-stop').on('click',function(){
		console.log("play or stop");
		if (!play) {
			$('#slideshow').carousel('cycle');
			$(this).children('span').removeClass('glyphicon-play').addClass('glyphicon-pause');
		}else{
			$('#slideshow').carousel('pause');
			$(this).children('span').removeClass('glyphicon-pause').addClass('glyphicon-play');
		}
		play = !play;
	});

});