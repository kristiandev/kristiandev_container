(function($){
	$(document).ready(function(){
		var turn = "x";
		var x = 0;
		var y = 1;
		var x_turns = [];
		var o_turns = [];
		var x_turns_try = 0;
		var o_turns_try = 0;
		var wins_combo = [[0, 1, 2], [3, 4, 5], [6, 7, 8], [0, 3, 6], [1, 4, 7], [2, 5, 8], [0, 5, 8],  [2, 4, 6]];
		var check_combo = 0;
		
		$(".box").click(function(){
			$(this).html(turn);
			$(this).addClass("selected");
			$("#turn-status").html(turn);
			
			x = $("#board .box").index(this);

			x_turns_try = 0;
			o_turns_try = 0;
			if(turn == "x"){
				turn = "o";
				x_turns.push($(".box").index(this));
			}else{
				turn = "x";
				o_turns.push($(".box").index(this));
			}
			if($(x_turns).length > 2){
				$(wins_combo).each(function(i, val){
					check_combo = 0;
					$(val).each(function(i2 , val2){
						console.log($.inArray(val2, x_turns));
						if($.inArray(val2, x_turns) >= 0){
							check_combo++;
						}
					});
					if(check_combo == 3){
						alert("X won!");
						resetBoard();
						x_turns = [];
						o_turns = [];
					}
				});
			}
			if($(o_turns).length > 2){
				$(wins_combo).each(function(i, val){
					check_combo = 0;
					$(val).each(function(i2 , val2){
						console.log($.inArray(val2, o_turns));
						if($.inArray(val2, o_turns) >= 0){
							check_combo++;
						}
					});
					if(check_combo == 3){
						alert("O won!");
						resetBoard();
						x_turns = [];
						o_turns = [];
					}
				});
			}
		});
	});
	function resetBoard(){
		$(".box").removeClass("selected");
		$(".box").html("");
	}
}(jQuery));