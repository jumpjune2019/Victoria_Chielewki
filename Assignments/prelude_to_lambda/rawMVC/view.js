var View = (() => {  //added

	var constructor = function() {
	
		this.triggerField = () => { //added
			var html = [
				"<div class='triggerContainerWrap'>",
					"<input type='text' placeholder='Add items' class='triggerText'></input>",
					"<button type='button' class='triggerButton'>Add</button>",
				"</div>"
			].join("");
			
			var constructor = function() {
			
				this.widget = () => return html; //added/return
				
				this.getButtonInstance = (contextEl) => {//added/return
					return contextEl.getElementsByClassName('triggerButton')[0];
				}
				
				this.getTextInstance = (contextEl) =>	return contextEl.getElementsByClassName('triggerText')[0]; //added/return
				
			
			}
			
			return new constructor;
		};
		
		this.listView = () =>{ //added
 			var html = [
			
				"<div class='listContainerWrap'>",
					"<ul class='listWrapper'>",
					"</ul>",
				"</div>"
			
			].join("");
			
			
			var constructor = function() {
			
				this.widget = ()  => return html; //added/return
				
				
				this.refresh = (mainView, contextEl, model) => { //added
					var listView = this;
					var ulContainer = contextEl.getElementsByClassName('listWrapper')[0];
					ulContainer.innerHTML = "";
					var count = model.getCount();
					var rows = [];
					var row;
					var data;
					var x;
					if(count > 0) {
						data = model.getData();
						for(x = 0; x < count; x++) {
							rows.push(mainView.listViewItem(data[x]));
						}
						ulContainer.innerHTML = rows.join("");
					}				}
				
				
				
			};
			
			return new constructor;
			
			
		
		};
		
		this.listViewItem = (text) => { //added
		
			var html = [
				"<li class='listItemWrap'>",
					"<span class='listItemTextWrap'>",
					text,
					"</span>",
					"<button type='button' value='",
					text,
					"' class='listItemButton'>Delete</button>",
				"</li>"
			].join("");
			
			return html;
		
		}

		this.emptyListItem = () => { //added
		
			var html = [
				"<li class='listItemWrap'>",
					"<span class='listItemTextWrap'>",
					"",
					"</span>",
				"</li>"
			].join("");
			
			return html;
		
		}

		
		this.summaryView = () => { //added
		
			var html = [
			
				"<div class='summaryViewWrapper'>",
					"<div class='summaryViewContent'></div>",					
				"</div>"
			
			].join("");
			
			var constructor = function() {
			
				this.widget = () =>  html; 	var x; //added/moved
			
				this.refresh = (mainView, contextEl, model) => { //added
				
					var listView = this;
					var summaryContent = contextEl.getElementsByClassName('summaryViewContent')[0];
					summaryContent.innerHTML = "";
					var count = model.getCount();
					var msg = "";
					switch(count) {
						case 0:
							msg = "There are no items in the store.";
						break
						
						case 1:
							msg = "There is one item in the store.";
						break;
						
						default:
							msg = "There are " + count + " items in the store.";
						break;
					
					}
					summaryContent.innerHTML = msg;
				}
				
			};
			
			return new constructor;
		}
		
		this.getLayout = ()=> {
			var layout = [
				this.triggerField().widget(),
				this.listView().widget(),
				this.summaryView().widget()
			].join("");
			
			return layout;
		}
		
	};
	
	return new constructor();
	
})();