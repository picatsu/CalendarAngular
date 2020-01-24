import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable()
export class ThemeService {
  private _darkTheme: Subject<boolean> = new Subject<boolean>();
  isDarkTheme = this._darkTheme.asObservable();

  constructor(){
     
  }
  
  setDarkTheme(isDarkTheme: boolean) {
    this._darkTheme.next(isDarkTheme);
  }
  getTheme(){
    this._darkTheme.next(true);
    return this._darkTheme;
  }
}
