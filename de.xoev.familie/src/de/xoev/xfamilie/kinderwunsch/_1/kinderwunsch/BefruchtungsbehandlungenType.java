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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Befruchtungsbehandlungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType#getVersuch <em>Versuch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBefruchtungsbehandlungenType()
 * @model extendedMetaData="name='BefruchtungsbehandlungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BefruchtungsbehandlungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Versuch</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versuch</em>' containment reference list.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBefruchtungsbehandlungenType_Versuch()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='versuch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersuchType> getVersuch();

} // BefruchtungsbehandlungenType
