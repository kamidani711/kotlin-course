# Zero to Mobile Engineer (Kotlin Edition)

A structured, 52-week engineering curriculum transitioning from vibe-coding to professional Android and Kotlin Multiplatform engineering.

## 🎯 The Mission
Master native Android development (Kotlin, Jetpack Compose, Coroutines/Flow, Room, Architecture Components) and Kotlin Multiplatform (KMP), while cultivating professional software engineering discipline:
- **70% Building, 30% Theory**
- **Strict No-AI typing in Phases 1–2** to internalize core language and architectural mental models.
- **AI-first engineering from Phase 4** with rigorous verification, testing, and understanding of every committed line.
- Defendable codebases, production deployments, and real client delivery.

---

## 🗺️ The 52-Week Roadmap & 8 Projects

| Phase | Weeks | Focus Area | Capstone App / Milestone | Target Level |
|---|---|---|---|---|
| **Phase 0** | Week 0 | Setup, Git, Keystores, Study Engine | Tools configured, *Chit* tagged & running from source | **L0** |
| **Phase 1** | Weeks 1–4 | Kotlin Foundations, Types, Collections, Tests | **App 1: Receipt Parser CLI** (Sealed results, Unit tests) | **L1: Kotlin Programmer** |
| **Phase 2** | Weeks 5–10 | Android & Jetpack Compose UI, Material 3, RTL | **App 2: Chit UI Rebuild** (Declarative UI, Dark mode, Arabic RTL) | **L2: UI Builder** |
| **Phase 3** | Weeks 11–18 | Coroutines, Flow, Offline-First Architecture | **App 3: SkyCast** (Weather API) & **App 4: Ledger** (Clean Chit rewrite) | **L3: App Developer** |
| **Phase 4** | Weeks 19–26 | Cloud, Firebase, Hardware APIs, On-Device AI | **App 5: Plateful v1** (Camera, ML Kit OCR, published on Google Play) | **L3 → L4** |
| **Phase 5** | Weeks 27–36 | Testing, Security, CI/CD, Client Delivery | **App 6: BookEasy** (Shipped for a real Dubai client) + Job Readiness | **L4: Job-Ready Junior** |
| **Phase 6** | Weeks 37–52 | Kotlin Multiplatform (KMP), Compose iOS, Stores | **App 7: Chit Multiplatform** & **App 8: Capstone Product** (Dual Stores) | **L5: Multiplatform Pro** |

---

## 🧠 The Study & Memory Engine
1. **Daily Anki (10–15 min):** Spaced retrieval across Kotlin, Compose, Android, and KMP subdecks.
2. **Monday Recall Warm-Up (10 min):** Closed-book paper recall of prior week principles.
3. **Friday Bug-Fix & Push:** Clean commits, formatted code, and updated documentation.
4. **Sunday Teach-Back & Drills:** 2-minute concept voice notes / "Beat the AI" comparative drills.
5. **The 30-Minute Rule:** Attempt solo for 30 minutes $\rightarrow$ Consult official docs $\rightarrow$ Ask AI as a tutor (explanation, not code generation).

---

## 📂 Repository Structure
```
kotlin-course/
├── phase-0-setup/                  # Setup week verifications and notes
├── phase-1-kotlin-foundations/     # Weeks 1-4 exercises and Project 1 CLI
│   ├── week-01/                    # Syntax, null safety, functions
│   ├── week-02/                    # Collections, lambdas, scope functions
│   ├── week-03/                    # Classes, sealed types, error handling
│   └── week-04-receipt-parser/     # App 1: Receipt Parser (CLI + Unit Tests)
├── phase-2-compose-ui/             # Weeks 5-10 Jetpack Compose exercises & App 2
├── phase-3-state-architecture/     # Weeks 11-18 Coroutines, Flow, Room, Hilt & Apps 3-4
├── phase-4-cloud-ai/               # Weeks 19-26 Firebase, ML Kit & App 5
├── phase-5-quality-client/         # Weeks 27-36 Testing, Security, CI/CD & App 6
├── phase-6-multiplatform/          # Weeks 37-52 KMP, Compose Multiplatform & Apps 7-8
├── cheat-sheets/                   # One-page summaries per phase
├── snippets/                       # Reusable battle-tested patterns (ViewModels, DAOs, Rules)
└── learning-log.md                 # Daily engineering journal and error log
```
