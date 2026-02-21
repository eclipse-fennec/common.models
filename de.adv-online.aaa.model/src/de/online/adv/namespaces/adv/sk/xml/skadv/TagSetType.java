/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TagSetType#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTagSetType()
 * @model extendedMetaData="name='TagSetType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TagSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.TagType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTagSetType_Tag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TagType1> getTag();

} // TagSetType
