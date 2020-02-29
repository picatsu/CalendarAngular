import { Component, OnInit, ChangeDetectionStrategy } from "@angular/core";

@Component({
  selector: "melvin-calendar",
  changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: "./melvin-calendar.component.html",
  styleUrls: ["./melvin-calendar.component.css"]
})
export class MelvinCalendarComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}
}
