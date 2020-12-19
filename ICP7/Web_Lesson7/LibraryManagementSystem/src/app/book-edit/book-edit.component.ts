import {Component, OnInit} from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
import {ApiService} from '../api.service';
import {FormControl, FormGroupDirective, FormBuilder, FormGroup, NgForm, Validators} from '@angular/forms';

@Component({
  selector: 'app-book-edit',
  templateUrl: './book-edit.component.html',
  styleUrls: ['./book-edit.component.css']
})
export class BookEditComponent implements OnInit {

	bookForm: FormGroup;
	isbn: string = "";
	title: string = "";
	description: string = "";
	author: string = "";
	publisher: string = "";
	published_year: string = "";


  constructor(private router: Router, private route: ActivatedRoute, private api: ApiService, private formBuilder: FormBuilder) {
  }

  ngOnInit() {
	this.bookForm = this.formBuilder.group({
		"isbn":"",
		"title":"",
		"description":"",
		"author":"",
		"publisher":"",
		"published_year":""
	});

	this.api.getBook(this.route.snapshot.params["id"]).subscribe(info => {
		// populate book form
		this.bookForm = this.formBuilder.group({
			"isbn": info.isbn,
			"title": info.title,
			"description": info.description,
			"author": info.author,
			"publisher": info.publisher,
			"published_year": info.published_year
        });
      });
    }
  
  onFormSubmit(form: NgForm) {
    // update record and navigate to book details
    this.api.updateBook(this.route.snapshot.params["id"], form)
      .subscribe(res => {
        var id = this.route.snapshot.params["id"];
        this.router.navigate(["/book-details", id]);
      })
  }



							  
																						  
															   
						 
													
													
					 
						   
		 
   



}
