var Model = (function() {

	var data = [];
	var widgets = [];
	var scope;
	var view;

	var constructor = function() {
		this.Add = (item) => { //added
			data.push(item);
			this.refreshWidgets(view, this);
		};
		
		this.Delete = (val) =>{ //added
			var itemIdx = data.indexOf(val);
			data.splice(itemIdx, 1);
			this.refreshWidgets(view, this);
		
		};

		this.notDuplicate = (val) => { //added
			result = false;
			if(this.getData().indexOf(val) == -1) {
				result = true;
			}
			return result;
		}

		this.getData = ()  =>  data; //added/return
		
		this.getCount = () =>  data.length; //added/return
		
		this.setScope = (s) => scope = s; //added/return
		
		this.setView = (v) =>  view = v;  //added/return

		
		this.registerWidget = (widget) =>  widgets.push(widget); //added/return
			// expect view to have it's refresh method
			
		this.refreshWidgets = (mainview, model)  => { //doesnt
			// will loop if any views are around and invoke their refresh method
			var x; l = widgets.length;
			if(l) {
				for(x = 0; x < l; x++) {
					widgets[x].refresh.apply(widgets[x], [mainview, scope, model]);
				}
			}		
		};
		
		// for testing content in console.log();
		this.toString = ()  => data.split(","); //added/return
		
		
	};
	
	return new constructor();
	
});