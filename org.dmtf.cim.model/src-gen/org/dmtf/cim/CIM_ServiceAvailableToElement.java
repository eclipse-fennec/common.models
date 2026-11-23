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
 * A representation of the model object '<em><b>CIM Service Available To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ServiceAvailableToElement conveys the semantics of a Service that is available for the use of a ManagedElement. An example of an available Service is that a Processor and an enclosure (a PhysicalElement) can use AlertOnLAN Services to signal an incomplete or erroneous boot. In reality, AlertOnLAN is simply a HostedService on a computer system that is generally available for use and is not a dependency of the processor or enclosure. To describe that the use of this service might be restricted or have limited availability or applicability, the CIM_ServiceAvailableToElement association would be instantiated between the Service and specific CIM_Processors and CIM_Chassis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAvailableToElement#getServiceProvided <em>Service Provided</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAvailableToElement#getUserOfService <em>User Of Service</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' keys='ServiceProvided,UserOfService'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceAvailableToElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Service that is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provided</em>' reference.
	 * @see #setServiceProvided(CIM_Service)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToElement_ServiceProvided()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Service REF' Key='true'"
	 * @generated
	 */
	CIM_Service getServiceProvided();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAvailableToElement#getServiceProvided <em>Service Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provided</em>' reference.
	 * @see #getServiceProvided()
	 * @generated
	 */
	void setServiceProvided(CIM_Service value);

	/**
	 * Returns the value of the '<em><b>User Of Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement that can use the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Of Service</em>' reference.
	 * @see #setUserOfService(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToElement_UserOfService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getUserOfService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAvailableToElement#getUserOfService <em>User Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Of Service</em>' reference.
	 * @see #getUserOfService()
	 * @generated
	 */
	void setUserOfService(CIM_ManagedElement value);

} // CIM_ServiceAvailableToElement
