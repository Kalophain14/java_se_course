# Git & GitHub — Complete Beginner's Guide

A structured walkthrough covering everything from Git basics to pull requests, branching, rebasing, and resolving merge conflicts.

---

## Table of Contents

- [Introduction](#introduction)
- [What is Git and GitHub?](#what-is-git-and-github)
- [Why Use Git and GitHub?](#why-use-git-and-github)
- [Getting Started](#getting-started)
  - [Downloading Git](#downloading-git)
  - [Basic Linux Commands](#basic-linux-commands)
- [Core Git Workflow](#core-git-workflow)
  - [Initializing a Repository](#initializing-a-repository)
  - [Making Your First Change](#making-your-first-change)
  - [Staging Changes](#staging-changes)
  - [Committing Changes](#committing-changes)
  - [Adding Data to Files](#adding-data-to-files)
  - [Removing Changes from Stage](#removing-changes-from-stage)
  - [Viewing Project History](#viewing-project-history)
  - [Making More Commits](#making-more-commits)
  - [Removing a Commit from History](#removing-a-commit-from-history)
- [Stashing](#stashing)
  - [Stashing Changes](#stashing-changes)
  - [Popping Stash](#popping-stash)
  - [Clearing Stash](#clearing-stash)
- [GitHub](#github)
  - [Creating a New Repository](#creating-a-new-repository)
  - [Connecting Remote to Local](#connecting-remote-to-local)
  - [Pushing Local Changes](#pushing-local-changes)
- [Branching](#branching)
  - [What Are Branches?](#what-are-branches)
  - [Use of Branches](#use-of-branches)
  - [Creating and Switching Branches](#creating-and-switching-branches)
  - [Merging a Branch into Main](#merging-a-branch-into-main)
  - [Pushing Changes to Master](#pushing-changes-to-master)
- [Working with Existing Projects](#working-with-existing-projects)
  - [Forking a Project](#forking-a-project)
  - [Cloning a Forked Project](#cloning-a-forked-project)
  - [Upstream — What It Is and How to Add It](#upstream--what-it-is-and-how-to-add-it)
- [Pull Requests](#pull-requests)
  - [What is a Pull Request?](#what-is-a-pull-request)
  - [Creating Your First Pull Request](#creating-your-first-pull-request)
  - [Removing a Commit from a Pull Request](#removing-a-commit-from-a-pull-request)
  - [Merging a Pull Request](#merging-a-pull-request)
  - [Keeping Your Fork in Sync](#keeping-your-fork-in-sync)
- [Advanced Topics](#advanced-topics)
  - [Squashing Commits](#squashing-commits)
  - [Rebase](#rebase)
  - [Hard Reset](#hard-reset)
  - [Merge Conflicts](#merge-conflicts)
- [Practice on Your Own](#practice-on-your-own)
- [What to Do Next](#what-to-do-next)

---

## Introduction

This guide is designed for complete beginners. You'll go from zero knowledge of version control to confidently contributing to open source projects using Git and GitHub.

---

## What is Git and GitHub?

**Git** is a distributed version control system that tracks changes in your code over time. It lets you save snapshots of your project, revert to previous states, and collaborate with others without overwriting each other's work.

**GitHub** is a cloud-based platform built on top of Git. It hosts your repositories online and adds collaboration tools like pull requests, code review, and issue tracking.

> Think of Git as the tool and GitHub as the place where you store and share your work.

---

## Why Use Git and GitHub?

- Track every change ever made to your project
- Safely experiment without breaking the main codebase
- Collaborate with other developers around the world
- Contribute to open source software
- Back up your code in the cloud

---

## Getting Started

### Downloading Git

Download Git from the official site: [https://git-scm.com](https://git-scm.com)

Verify the installation:
```bash
git --version
```

### Basic Linux Commands

| Command | Description |
|---|---|
| `pwd` | Print current directory |
| `ls` | List files and folders |
| `cd <folder>` | Change directory |
| `mkdir <name>` | Create a new folder |
| `touch <file>` | Create a new file |
| `cat <file>` | Display file contents |
| `rm <file>` | Delete a file |
| `clear` | Clear the terminal |

---

## Core Git Workflow

### Initializing a Repository

```bash
git init
```

Run this inside your project folder to start tracking it with Git. This creates a hidden `.git` directory.

### Making Your First Change

Create or edit a file in your project. Git will detect the change but won't track it until you stage it.

```bash
git status
```

### Staging Changes

Staging prepares changes to be included in the next commit.

```bash
git add <filename>    # Stage a specific file
git add .             # Stage all changes
```

### Committing Changes

A commit is a saved snapshot of your staged changes.

```bash
git commit -m "Your descriptive message here"
```

### Adding Data to Files

Edit a file and re-stage it before committing:

```bash
echo "New content" >> file.txt
git add file.txt
git commit -m "Add content to file"
```

### Removing Changes from Stage

Changed your mind? Unstage a file without losing your edits:

```bash
git restore --staged <filename>
```

### Viewing Project History

```bash
git log              # Full commit history
git log --oneline    # Condensed one-line view
```

### Making More Commits

Repeat the stage → commit cycle to build up a meaningful project history. Good commit messages explain *what* changed and *why*.

### Removing a Commit from History

⚠️ Use with caution — this rewrites history.

```bash
git reset HEAD~1        # Remove last commit, keep changes staged
git reset --soft HEAD~1 # Keep changes in working directory
git reset --hard HEAD~1 # Discard changes entirely
```

---

## Stashing

Stashing temporarily shelves changes you're not ready to commit.

### Stashing Changes

```bash
git stash
```

### Popping Stash

Re-apply the most recently stashed changes:

```bash
git stash pop
```

### Clearing Stash

Remove all stashed entries:

```bash
git stash clear
```

---

## GitHub

### Creating a New Repository

1. Go to [github.com](https://github.com) and sign in
2. Click **New repository**
3. Give it a name and choose public or private
4. Click **Create repository**

### Connecting Remote to Local

```bash
git remote add origin https://github.com/your-username/your-repo.git
```

Verify the connection:
```bash
git remote -v
```

### Pushing Local Changes

```bash
git push -u origin main
```

The `-u` flag sets the upstream, so future pushes only need `git push`.

---

## Branching

### What Are Branches?

A branch is an independent line of development. The default branch is called `main` (or `master` in older projects). Branches let you work on features or fixes in isolation.

### Use of Branches

- Develop features without affecting the main codebase
- Work in parallel with teammates
- Keep experimental code separate until it's ready

### Creating and Switching Branches

```bash
git branch <branch-name>        # Create a branch
git switch <branch-name>        # Switch to it
git switch -c <branch-name>     # Create and switch in one step
```

Practice interactive branching at: [learngitbranching.js.org](https://learngitbranching.js.org)

### Merging a Branch into Main

```bash
git switch main
git merge <branch-name>
```

### Pushing Changes to Master

After merging locally, push the updated main branch:

```bash
git push origin main
```

---

## Working with Existing Projects

### Forking a Project

A **fork** is your personal copy of someone else's repository on GitHub. It lets you freely experiment without affecting the original project.

To fork: navigate to a GitHub repo → click **Fork** → select your account.

### Cloning a Forked Project

Download your fork to your local machine:

```bash
git clone https://github.com/your-username/forked-repo.git
cd forked-repo
```

### Upstream — What It Is and How to Add It

**Upstream** refers to the original repository you forked from. Adding it lets you pull in updates from the source project.

```bash
git remote add upstream https://github.com/original-owner/repo.git
git remote -v    # Should now show both origin and upstream
```

---

## Pull Requests

### What is a Pull Request?

A **pull request (PR)** is a request to merge your branch or fork changes into another repository. It's the standard way to contribute to open source projects and collaborate on teams.

The workflow:
1. Fork the repo
2. Clone it locally
3. Create a new branch
4. Make your changes and commit
5. Push the branch to your fork
6. Open a pull request on GitHub

### Creating Your First Pull Request

> ⚠️ Never commit directly to `main`. Always work on a dedicated branch.

```bash
git switch -c my-feature-branch
# Make your changes
git add .
git commit -m "Add my feature"
git push origin my-feature-branch
```

Then go to GitHub → your fork → click **Compare & pull request**.

### Removing a Commit from a Pull Request

If you need to remove a commit from an open PR, use force push:

```bash
git reset HEAD~1           # Remove the last commit locally
git push origin <branch> --force
```

### Merging a Pull Request

Once your PR is reviewed and approved, click **Merge pull request** on GitHub — or the repo maintainer will merge it.

### Keeping Your Fork in Sync

After your PR is merged (or others' PRs are merged into the original), sync your fork:

```bash
git fetch upstream
git switch main
git merge upstream/main
git push origin main
```

---

## Advanced Topics

### Squashing Commits

Squashing combines multiple commits into one clean commit — useful before opening a PR.

```bash
git rebase -i HEAD~<number-of-commits>
```

In the interactive editor, change `pick` to `squash` (or `s`) for the commits you want to combine.

### Rebase

Rebase re-applies your commits on top of another branch, creating a cleaner, linear history.

```bash
git rebase main
```

> Use rebase for a clean history. Use merge to preserve the full context of when branches diverged.

### Hard Reset

Discard all changes and move to a specific commit:

```bash
git reset --hard <commit-hash>
```

⚠️ This permanently removes uncommitted changes and rewrites history. Use with care.

### Merge Conflicts

A **merge conflict** happens when two branches modify the same part of a file differently. Git can't auto-resolve it — you have to decide what to keep.

**How to resolve:**

1. Run `git merge <branch>` — Git will flag conflicting files
2. Open the conflicted file(s). You'll see markers like:
   ```
   <<<<<<< HEAD
   Your changes
   =======
   Incoming changes
   >>>>>>> branch-name
   ```
3. Edit the file to keep what you want, then remove the markers
4. Stage and commit the resolved file:
   ```bash
   git add <resolved-file>
   git commit -m "Resolve merge conflict"
   ```

---

## Practice on Your Own

The best way to learn Git is by doing. Here's a suggested practice flow:

1. Create a new local repo and make several commits
2. Create a branch, make changes, and merge it back
3. Fork an open source project on GitHub
4. Clone your fork, make a small improvement, and open a pull request
5. Practice rebasing and squashing on a test repo before doing it on real work

---

## What to Do Next

- ✅ Practice daily — even small commits build muscle memory
- 📖 Read the [official Git docs](https://git-scm.com/doc)
- 🎮 Complete [Learn Git Branching](https://learngitbranching.js.org) interactively
- 🌍 Contribute to open source on [GitHub Explore](https://github.com/explore)
- 🔍 Look into **GitHub Actions** for CI/CD automation once you're comfortable with the basics
