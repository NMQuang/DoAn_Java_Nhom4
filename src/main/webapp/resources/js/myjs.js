$(document).ready(function () {
    $('#myCarousel').carousel({
        interval: 10000
    })
});

//show giá trong danh sách món ăn
$(function(){
	$('._show_price').each(function( index, element ){
		var _price = $(element).find('._price');
		var min = $(element).attr('price-min');
		if(min == -1)
			return _price.text("Chưa được bán")
		min = Number(parseFloat(min)).toLocaleString();
		var max = $(element).attr('price-max');
		max = Number(parseFloat(max)).toLocaleString();
		if(min == max)
			return _price.text(min  + ' VND');
		_price.text( min + ' - ' + max + ' VND');
	})
})

$(function(){
	$('._single_price').each(function(index, element){
		var price = $(element).attr('price');
		price = Number(parseFloat(price)).toLocaleString();
		$(element).text(price)
	})
})