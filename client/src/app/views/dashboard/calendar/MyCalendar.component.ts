import {
  Component,
  ChangeDetectionStrategy,
  ViewChild,
  TemplateRef,
  ElementRef,
  Input,
  LOCALE_ID
} from "@angular/core";
import {
  startOfDay,
  endOfDay,
  subDays,
  addDays,
  endOfMonth,
  isSameDay,
  isSameMonth,
  addHours,
  addMinutes
} from "date-fns";
import { Subject } from "rxjs";
import { NgbModal } from "@ng-bootstrap/ng-bootstrap";

import {
  CalendarEvent,
  CalendarEventAction,
  CalendarEventTimesChangedEvent,
  CalendarView,
  CalendarDateFormatter,
  DAYS_OF_WEEK
} from "angular-calendar";
import { DashboardService } from "../service/dashboard.service";
import { formatDate, registerLocaleData } from "@angular/common";
import { CustomSeance } from "../model/customSeance";
import { Un_Etudiant } from "../model/un_etudiant";
import localeFr from "@angular/common/locales/fr";
import { LoginService } from "../../login/Login.service";
registerLocaleData(localeFr);
const colors: any = {
  red: {
    primary: "#ad2121",
    secondary: "#FAE3E3"
  },
  blue: {
    primary: "#1e90ff",
    secondary: "#D1E8FF"
  },
  yellow: {
    primary: "#e3bc08",
    secondary: "#FDF1BA"
  },
  violet: {
    primary: "#d4e308",
    secondary: "#DAA520"
  },
  green: {
    primary: "#8be308",
    secondary: "#90EE90"
  }
};

@Component({
  selector: "mwl-MyCalendar-component",
  changeDetection: ChangeDetectionStrategy.OnPush,
  styleUrls: ["styles.css"],
  templateUrl: "MyCalendar.html",
  providers: [{ provide: LOCALE_ID, useValue: "fr-FR" }]
})
export class MyCalendarComponent {
  @ViewChild("modalContent", { static: true }) modalContent: TemplateRef<any>;
  @ViewChild("month") myId: ElementRef;
  @Input() dayEndHour: number = 9;

  modalData: {
    action: string;
    event: CalendarEvent;
  };
  actions: CalendarEventAction[] = [
    {
      label: '<i class="fa fa-fw fa-pencil"></i>',
      a11yLabel: "Edit",
      onClick: ({ event }: { event: CalendarEvent }): void => {
        this.handleEvent("Edited", event);
      }
    },
    {
      label: '<i class="fa fa-fw fa-times"></i>',
      a11yLabel: "Delete",
      onClick: ({ event }: { event: CalendarEvent }): void => {
        this.events = this.events.filter(iEvent => iEvent !== event);
        this.handleEvent("Deleted", event);
      }
    }
  ];
  events: CalendarEvent[] = [
    {
      start: subDays(startOfDay(new Date()), 1),
      end: addDays(new Date(), 1),
      title: "A 3 day event",
      color: colors.red,
      actions: this.actions,
      allDay: true,
      resizable: {
        beforeStart: true,
        afterEnd: true
      },
      draggable: true
    },
    {
      start: startOfDay(new Date()),
      title: "An event with no end date",
      color: colors.yellow,
      actions: this.actions
    },
    {
      start: subDays(endOfMonth(new Date()), 3),
      end: addDays(endOfMonth(new Date()), 3),
      title: "A long event that spans 2 months",
      color: colors.blue,
      allDay: true
    },
    {
      start: addHours(startOfDay(new Date()), 2),
      end: addHours(new Date(), 2),
      title: "A draggable and resizable event",
      color: colors.yellow,
      actions: this.actions,
      resizable: {
        beforeStart: true,
        afterEnd: true
      },
      draggable: true
    }
  ];

  events2: CalendarEvent[] = [
    {
      start: new Date("2020-02-27T08:30:00"),
      end: new Date("2020-02-27T10:00:00"),
      title:
        "<center> <Strong> Matiere </Strong> <br />    Professeur <br />  Salle: IBGI afbaf </center> ",
      color: colors.yellow
    },
    {
      start: new Date("2020-02-27T10:30:00"),
      end: new Date("2020-02-27T12:00:00"),
      title:
        "<center> <Strong> Matiere </Strong> <br />    Professeur <br />  Salle: IBGI afbaf </center> ",
      color: colors.blue
    }
  ];

  listclass = [
    "l1",
    "l1_gr1",
    "l1_gr2",
    "l1_gr3",
    "l1_gr4",
    "l1_gr5",
    "l1_gr6",
    "l1_gr7",
    "l1_gr8",
    "l2",
    "l3_bcp",
    "l3_bpc",
    "l3_gbi",
    "l3baia",
    "l3_bcp g1",
    "l3_bcp g2",
    "l3_bcp g2_",
    "l3_bpc g2_",
    "m1",
    "m1_gp1",
    "m1_gp2",
    "m2bss",
    "m2btcg",
    "m2ttt",
    "m2bss_angl",
    "m2gbi",
    "m2ggs",
    "m2bss_fran",
    "m2ggs_pro",
    "m2ggs_rec",
    "m2bss_bio",
    "m2bss_math"
  ];
  listProf = [
    "DELAPLACEFRANCK",
    "DEBILYMARIE-ANNE",
    "BOUDETNATHALIE",
    "GONNETFLORENCE",
    "SANSOMFRANCK",
    "BOUNARFLORENCE",
    "PETIT-TEIXEIRAELISABETH",
    "BIGEARDJEAN",
    "PASTREDAVID",
    "LEBERPIERRE",
    "ARTIGUENEUVEFRANCOIS",
    "WIARTLAURENT",
    "SGHIRABDELGHANI",
    "ROUSSEAUFRANCIS",
    "ZEHRAOUIFARIDA",
    "COLCOMBETJEAN",
    "SAVARINPHILIPPE",
    "AMBROISECHRISTOPHE",
    "HUTZLERGUILLAUME",
    "CORELEDUARDO",
    "ZAAGRIM",
    "RIZZONCARENE",
    "PLOIXDAMIEN"
  ];
  defaultclass = this.listclass[0];
  defaultprof = this.listProf[0];
  testElement = {};
  view: CalendarView = CalendarView.Week;
  CalendarView = CalendarView;
  viewDate: Date = new Date("2013-11-04T09:15:00.000Z");
  refresh: Subject<any> = new Subject();
  activeDayIsOpen: boolean = true;
  public loading = false;
  mongoisactive = true;
  locale: string = "fr";
  admin: boolean = false;
  weekStartsOn: number = DAYS_OF_WEEK.MONDAY;
  weekendDays: number[] = [DAYS_OF_WEEK.FRIDAY, DAYS_OF_WEEK.SATURDAY];
  couchdbisactive = false;
  constructor(
    private modal: NgbModal,
    private dashService: DashboardService,
    readonly loginservice: LoginService
  ) {
    this.loadData();
    if (this.loginservice.getMyRole() == "admin") {
      this.admin = true;
    }
  }

  somethingChanged(s: string) {
    console.log("somthing changed : ", s);
    if (s == "mongo") {
      this.mongoisactive = true;
      this.couchdbisactive = false;
      this.dashService.setActivedb(s);
    }
    if (s == "couchdb") {
      this.couchdbisactive = true;
      this.mongoisactive = false;
      this.dashService.setActivedb(s);
    }
  }
  loadData() {
    this.events2 = [];
    this.loading = true;
    if (!this.admin) {
      this.dashService
        .getCustomSeance(this.defaultclass, this.admin)
        .subscribe((val: CustomSeance[]) => {
          val.forEach(x => {
            this.events2.push({
              start: new Date(x.formatedDate),
              end: new Date(x.formatedDateEnd),
              title:
                "<center> <Strong>" +
                x.nomMatiere +
                "</Strong> <br />" +
                this.hideIfNull("", x.nomProf) +
                "<br />  " +
                this.hideIfNull("Salle: ", x.nomSalle) +
                " </center> ",
              color: this.selectColor(x.nomMatiere)
            });
          });
          this.loading = false;
        });
    } else {
      this.dashService
        .getCustomSeanceForProf(this.defaultprof)
        .subscribe((val: CustomSeance[]) => {
          val.forEach(x => {
            this.events2.push({
              start: new Date(x.formatedDate),
              end: new Date(x.formatedDateEnd),
              title:
                "<center> <Strong>" +
                x.nomMatiere +
                "</Strong> <br />" +
                this.hideIfNull("", x.nomProf) +
                "<br />  " +
                this.hideIfNull("Salle: ", x.nomSalle) +
                " </center> ",
              color: this.selectColor(x.nomMatiere)
            });
          });
          this.loading = false;
        });
    }
  }

  hideIfNull(element: string, value: string) {
    if (value == "null" || value == null) {
      return "";
    }
    return element + value;
  }

  selectColor(value: string) {
    if (value.includes("CM")) {
      return colors.blue;
    }
    if (value.includes("DS") || value.includes("EXAMEN")) {
      return colors.red;
    }
    if (value.includes("CM")) {
      return colors.blue;
    }
    if (value.includes("TP")) {
      return colors.violet;
    }
    if (value.includes("TD")) {
      return colors.green;
    }
    return colors.yellow;
  }
  public setDefaultListClass(value: string) {
    console.log(" default class ", value);
    this.defaultclass = value;
    this.events2 = [];
    this.loadData();
  }

  public setDefaultListProf(value: any) {
    console.log(" default prof  ddd ", value);

    this.defaultprof = value;
    this.events2 = [];
    this.loadData();
  }

  dayClicked({ date, events }: { date: Date; events: CalendarEvent[] }): void {
    if (isSameMonth(date, this.viewDate)) {
      if (
        (isSameDay(this.viewDate, date) && this.activeDayIsOpen === true) ||
        events.length === 0
      ) {
        this.activeDayIsOpen = false;
      } else {
        this.activeDayIsOpen = true;
      }
      this.viewDate = date;
    }
  }

  eventTimesChanged({
    event,
    newStart,
    newEnd
  }: CalendarEventTimesChangedEvent): void {
    this.events = this.events.map(iEvent => {
      if (iEvent === event) {
        return {
          ...event,
          start: newStart,
          end: newEnd
        };
      }
      return iEvent;
    });
    this.handleEvent("Dropped or resized", event);
  }

  handleEvent(action: string, event: CalendarEvent): void {
    this.modalData = { event, action };
    this.modal.open(this.modalContent, { size: "lg" });
  }

  addEvent(): void {
    this.events = [
      ...this.events,
      {
        title: "New event",
        start: startOfDay(new Date()),
        end: endOfDay(new Date()),
        color: colors.red,
        draggable: true,
        resizable: {
          beforeStart: true,
          afterEnd: true
        }
      }
    ];
  }

  deleteEvent(eventToDelete: CalendarEvent) {
    this.events = this.events.filter(event => event !== eventToDelete);
  }

  setView(view: CalendarView) {
    this.view = view;
  }

  closeOpenMonthViewDay() {
    this.activeDayIsOpen = false;
  }
}
