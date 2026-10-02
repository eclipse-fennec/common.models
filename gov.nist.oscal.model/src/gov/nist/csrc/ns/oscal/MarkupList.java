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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupList#getLi <em>Li</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupList()
 * @model extendedMetaData="name='listType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MarkupList extends EObject {
	/**
	 * Returns the value of the '<em><b>Li</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Li</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupList_Li()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='li' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MarkupListItem> getLi();

} // MarkupList
