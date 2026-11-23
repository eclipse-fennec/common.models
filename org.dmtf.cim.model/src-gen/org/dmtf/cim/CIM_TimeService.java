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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Time Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TimeService manages time (retrieves or sets time) for one or more elements in a system. All elements to which the Service applies are associated using ServiceAffectsElement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TimeService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TimeService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method gets or sets the time for the specified element.
	 * @param GetRequest Indicates whether the request is to get (TRUE) or set (FALSE) the time for the specified element.
	 * @param TimeData The current date and time. On input, this value is the time that is set on the specified element, if the GetRequest input parameter is TRUE. Otherwise, the input time is ignored. On output, this value is the time as it is known by the element.
	 * @param ManagedElement A reference to the ManagedElement whose time is retrieved or set. This reference is necessary because the TimeService might apply to multiple elements simultaneously. The referenced element must be associated with the Service using the ServiceAffectsElement relationship.
	 * <!-- end-model-doc -->
	 * @model GetRequestAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" TimeDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true' Out='true'" ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ManageTime(Boolean GetRequest, String TimeData, CIM_ManagedElement ManagedElement);

} // CIM_TimeService
