# Java Class ☕

## Overview
This program simulates a mechanical pencil that manages the insertion, removal, and usage of leads. The pencil has a specific caliber, and only compatible leads can be inserted.

## Features
 - Initialize Pencil

    - Starts a pencil with a given caliber and no lead loaded.
    - Insert Lead

- Adds a lead by specifying:
    - Caliber: A float indicating the lead's thickness.
    - Hardness: A string such as "HB", "2B", "4B", or "6B".
    - Length: An int indicating the lead's size in millimeters.
    - Incompatible leads (wrong caliber) are rejected.
    - Remove Lead

- Removes the lead from the pencil if one is loaded.
    - Write on Paper

- Writing is only possible if:
    - There is a lead loaded.
    - The lead's length is greater than 10mm.
    - Lead consumption depends on hardness:
    - "HB": 1mm per page.
    - "2B": 2mm per page.
    - "4B": 4mm per page.
    - "6B": 6mm per page.
    - Writing stops when the lead is reduced to 10mm, as the last 10mm cannot be used.
    - If there is not enough lead to complete a page, it alerts that the text is incomplete.
