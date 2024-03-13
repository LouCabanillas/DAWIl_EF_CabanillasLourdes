import { Component, OnInit } from '@angular/core';
import { TicketService } from '../../services/ticket/web-api.service';
import { Ticket } from '../../services/ticket/ticket';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ticket',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './ticket.component.html',
  styleUrl: './ticket.component.css'
})
export class TicketComponent implements OnInit {
  tickets: Ticket[] = [];

  constructor(private ticketService: TicketService) { }

  ngOnInit(): void {
    this.load();
  }

  load(): void {
    this.ticketService.get().subscribe(tickets => {
      this.tickets = tickets;
    });
  }

}