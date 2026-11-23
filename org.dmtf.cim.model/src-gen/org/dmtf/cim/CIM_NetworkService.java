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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Network Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract base class, derived from the Service class. It is deprecated in Version 2.7 with the recommendation that the Service class be subclassed instead. Distinguishing between services that modify traffic versus supporting basic communication has not proved useful.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkService#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkService#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkService#getStartupConditions <em>Startup Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkService#getStartupParameters <em>Startup Parameters</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkService()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_Service\"]' Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a free-form array of strings that provide descriptive words and phrases that can be used in queries. To-date, this property has not been implemented, since it is not standardized. Also, if this was a necessary query construct, then it would be required higher in the inheritance hierarchy. The latter has not proven necessary. Therefore, the property is deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkService_Keywords()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getKeywords();

	/**
	 * Returns the value of the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a URL that provides the protocol, network location, and other service-specific information required in order to access the service. It is deprecated with the recommendation that ServiceAccessURI be instantiated instead. This new class correctly positions the semantics of the service access, and clarifies the format of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service URL</em>' attribute.
	 * @see #setServiceURL(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkService_ServiceURL()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ServiceAccessURI\"]'"
	 * @generated
	 */
	String getServiceURL();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkService#getServiceURL <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URL</em>' attribute.
	 * @see #getServiceURL()
	 * @generated
	 */
	void setServiceURL(String value);

	/**
	 * Returns the value of the '<em><b>Startup Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a free-form array of strings that specify any specific pre-conditions that must be met in order for this service to start correctly. It was expected that subclasses would refine the inherited StartService() method to suit their specific needs. To-date, this refinement has not been necessary. Also, the property is not very useful, since it is not standardized. If this was a necessary construct, then it would be required higher in the inheritance hierarchy (on Service). The latter has not proven true. Therefore, the property is deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Startup Conditions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkService_StartupConditions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getStartupConditions();

	/**
	 * Returns the value of the '<em><b>Startup Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a free-form array of strings that specify any specific parameters that must be supplied to the StartService() method in order for this service to start correctly. It was expected that subclasses would refine the inherited StartService() methods to suit their specific needs. To-date, this refinement has not been necessary. If indeed the method were refined, then its parameters would more formally convey this information. Therefore, the property is deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Startup Parameters</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkService_StartupParameters()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getStartupParameters();

} // CIM_NetworkService
