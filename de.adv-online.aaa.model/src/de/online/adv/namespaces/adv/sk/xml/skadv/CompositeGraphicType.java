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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompositeGraphicType#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompositeGraphicType()
 * @model extendedMetaData="name='CompositeGraphicType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositeGraphicType extends GraphicType3 {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.MemberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SimpleGraphic als "member" eines CompositeGraphic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompositeGraphicType_Member()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MemberType> getMember();

} // CompositeGraphicType
