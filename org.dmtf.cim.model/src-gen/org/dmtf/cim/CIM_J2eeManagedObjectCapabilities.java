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
 * A representation of the model object '<em><b>CIM J2ee Managed Object Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeManagedObjectCapabilities is a class for defining additional capabilities of J2EE managed objects. It contains the attributes that are common to all J2EE managed objects. These common attributes are mapped to the corresponding J2EE classes using the CIM_ElementCapabilities association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeManagedObjectCapabilities#getStateManageable <em>State Manageable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeManagedObjectCapabilities#getStatisticsProvider <em>Statistics Provider</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeManagedObjectCapabilities#getEventProvider <em>Event Provider</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeManagedObjectCapabilities()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.InstanceID='string' override.InstanceID.Description='InstanceID identifies a unique instance of a J2EE ManagedObject\'s Capabilities in a given namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.InstanceID.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.InstanceID.ModelCorrespondence='[\"CIM_J2eeManagedObjectCapabilities.ElementName\"]' override.ElementName='string' override.ElementName.Description='The name of a J2EE managed object. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.ElementName.MaxLen='256' override.ElementName.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.ElementName.ModelCorrespondence='[\"CIM_J2eeManagedObjectCapabilities.InstanceID\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeManagedObjectCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>State Manageable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property that indicates whether the managed object implements the state management model as defined in State Management chapter of the JSR77 specification. A value of true indicates that the managed object implements the state management interface. A value of false indicates that the managed object does not implement the state management interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Manageable</em>' attribute.
	 * @see #setStateManageable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeManagedObjectCapabilities_StateManageable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.2 stateManageable|V1.0\"]'"
	 * @generated
	 */
	Boolean getStateManageable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeManagedObjectCapabilities#getStateManageable <em>State Manageable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Manageable</em>' attribute.
	 * @see #getStateManageable()
	 * @generated
	 */
	void setStateManageable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Statistics Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property that indicates whether the managed object implements the statistics provider model as defined in Performance Monitoring chapter of the JSR77 specification. A value of true indicates that the managed object implements the statistics provider interface. A value of false indicates that the managed object does not implement the statistics provider interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistics Provider</em>' attribute.
	 * @see #setStatisticsProvider(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeManagedObjectCapabilities_StatisticsProvider()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.3 statisticsProvider|V1.0\"]'"
	 * @generated
	 */
	Boolean getStatisticsProvider();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeManagedObjectCapabilities#getStatisticsProvider <em>Statistics Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics Provider</em>' attribute.
	 * @see #getStatisticsProvider()
	 * @generated
	 */
	void setStatisticsProvider(Boolean value);

	/**
	 * Returns the value of the '<em><b>Event Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property that indicates whether the managed object implements the event provider model as defined in the Events chapter of the JSR77 specification. A value of true indicates that the managed object implements the event provider interface. A value of false indicates that the managed object does not implement the event provider interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Provider</em>' attribute.
	 * @see #setEventProvider(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeManagedObjectCapabilities_EventProvider()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.4 eventProvider|V1.0\"]'"
	 * @generated
	 */
	Boolean getEventProvider();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeManagedObjectCapabilities#getEventProvider <em>Event Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Provider</em>' attribute.
	 * @see #getEventProvider()
	 * @generated
	 */
	void setEventProvider(Boolean value);

} // CIM_J2eeManagedObjectCapabilities
