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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupTableRow#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupTableRow#getTd <em>Td</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupTableRow#getTh <em>Th</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupTableRow()
 * @model extendedMetaData="name='tableRowType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MarkupTableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupTableRow_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Td</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupTableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Td</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupTableRow_Td()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='td' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MarkupTableCell> getTd();

	/**
	 * Returns the value of the '<em><b>Th</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupTableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Th</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupTableRow_Th()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='th' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MarkupTableCell> getTh();

} // MarkupTableRow
