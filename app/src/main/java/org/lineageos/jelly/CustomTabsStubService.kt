/*
 * SPDX-FileCopyrightText: 2026 The BasedOS Project
 * SPDX-License-Identifier: Apache-2.0
 *
 * Minimal Custom Tabs service stub so that apps using androidx.browser
 * (e.g. Privy SDK OAuth) discover Jelly as a Custom Tabs provider.
 * The actual URL is opened via ACTION_VIEW on MainActivity — this
 * service only needs to exist for the PackageManager query.
 */
package org.lineageos.jelly

import android.app.Service
import android.content.Intent
import android.os.IBinder

class CustomTabsStubService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null
}
