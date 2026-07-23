import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  message = '';
  searchTerm = '';
  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }
  portalName = 'Student Course Portal';
  isPortalActive = true;
}
