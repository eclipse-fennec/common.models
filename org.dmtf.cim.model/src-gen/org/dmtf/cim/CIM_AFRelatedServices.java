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
package org.dmtf.cim;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM AF Related Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IETF's RFC2597 describes a Differentiated Services Per-Hop-Behavior (PHB) Group called Assured Forwarding (AF). Quoting from the RFC, 'The AF PHB group provides delivery of IP packets in four independently forwarded AF classes. Within each AF class, an IP packet can be assigned one of three different levels of drop precedence.' The AFRelatedServices association describes the precedence of the individual AF drop-related Services within an AF IP packet-forwarding class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AFRelatedServices#getAFLowerDropPrecedence <em>AF Lower Drop Precedence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AFRelatedServices#getAFHigherDropPrecedence <em>AF Higher Drop Precedence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AFRelatedServices()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::QoS' keys='AFLowerDropPrecedence,AFHigherDropPrecedence'"
 * @generated
 */
@ProviderType
public interface CIM_AFRelatedServices extends EObject {
	/**
	 * Returns the value of the '<em><b>AF Lower Drop Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AFService with a lower drop precedence (ie, lower probability of dropping packets).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AF Lower Drop Precedence</em>' reference.
	 * @see #setAFLowerDropPrecedence(CIM_AFService)
	 * @see org.dmtf.cim.CimPackage#getCIM_AFRelatedServices_AFLowerDropPrecedence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AFService REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_AFService getAFLowerDropPrecedence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AFRelatedServices#getAFLowerDropPrecedence <em>AF Lower Drop Precedence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AF Lower Drop Precedence</em>' reference.
	 * @see #getAFLowerDropPrecedence()
	 * @generated
	 */
	void setAFLowerDropPrecedence(CIM_AFService value);

	/**
	 * Returns the value of the '<em><b>AF Higher Drop Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AFService at the same IP packet-forwarding class level, but at a higher drop precedence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AF Higher Drop Precedence</em>' reference.
	 * @see #setAFHigherDropPrecedence(CIM_AFService)
	 * @see org.dmtf.cim.CimPackage#getCIM_AFRelatedServices_AFHigherDropPrecedence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AFService REF' Key='true'"
	 * @generated
	 */
	CIM_AFService getAFHigherDropPrecedence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AFRelatedServices#getAFHigherDropPrecedence <em>AF Higher Drop Precedence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AF Higher Drop Precedence</em>' reference.
	 * @see #getAFHigherDropPrecedence()
	 * @generated
	 */
	void setAFHigherDropPrecedence(CIM_AFService value);

} // CIM_AFRelatedServices
