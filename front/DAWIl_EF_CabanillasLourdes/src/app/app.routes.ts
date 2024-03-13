import { Routes } from '@angular/router';

export const routes: Routes = [

    {
        path: 'login',
        loadComponent: () => import('./components/auth/login/login.component').then(m => m.LoginComponent)
    },
    {
        path: '',
        loadComponent: () => import('./components/dashboard/dashboard.component').then(m => m.DashboardComponent)
    },
    {
        path: 'user',
        loadComponent: () => import('./components/user/user.component').then(m => m.UserComponent)
    },
    {
        path: 'ticket',
        loadComponent: () => import('./components/ticket/ticket.component').then(m => m.TicketComponent)
    }
];
