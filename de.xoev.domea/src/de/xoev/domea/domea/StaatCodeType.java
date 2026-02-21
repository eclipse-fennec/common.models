/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package de.xoev.domea.domea;

import de.xoev.schemata.code.code.Code;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staat Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Datentyp zur Werteliste von Staaten unter Angabe weiterer Informationen zur konkreten Angabe eines Wertes. Genutzt wird hier die ISO-3166-1-Liste. Für den Schlüssel (code) wird die Spalte "ALPHA2" und für den beschreibenden Namen (name) die Spalte "Name des Landes" verwendet.
 * <!-- end-model-doc -->
 *
 *
 * @see de.xoev.domea.domea.DomeaPackage#getStaatCodeType()
 * @model extendedMetaData="name='StaatCodeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatCodeType extends Code {
} // StaatCodeType
