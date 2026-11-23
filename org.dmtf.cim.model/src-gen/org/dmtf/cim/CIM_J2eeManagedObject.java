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
 * A representation of the model object '<em><b>CIM J2ee Managed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeManagedObject is a class for defining operations that may supported by all J2EE managed objects. It contains the attributes and methods that are common to all J2EE managed objects. The J2EE Managed objects - for eg. J2eeServer should participate in instances of the CIM_LogicalIdentity association with the corresponding instance of the J2eeManagedObject class. The start and stop methods of JSR77's J2eeManagedObject find an equivalent in the RequestStateChange method inherited from EnabledLogicalElement. Using Enabled/Disabled as inputs to RequestStateChange, one can effect start and stop.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeManagedObject#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeManagedObject()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.19.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID identifies a unique instance of a J2EE ManagedObject\'s Capabilities in a given namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.InstanceID.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.InstanceID.ModelCorrespondence='[\"CIM_J2eeManagedObject.ElementName\"]' override.ElementName='string' override.ElementName.Description='The name of a J2EE managed object. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.ElementName.MaxLen='256' override.ElementName.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.ElementName.ModelCorrespondence='[\"CIM_J2eeManagedObject.InstanceID\"]' override.OperationalStatus='uint16[]' override.OperationalStatus.Description='The current state of the entity for J2ee managed objects that support state management. If the StateManageable property is FALSE, the value of this property MUST be set to 0 - Unknown. The mapping from the J2ee management states to OperationalStatus is as follows - j2ee.state.starting - Starting, j2ee.state.running - OK, j2ee.state.stopping - Stopping, j2ee.state.stopped - Stopped, and j2ee.state.failed - Error.' override.OperationalStatus.ValueMap='[\"0\",\"2\",\"6\",\"8\",\"9\",\"10\"]' override.OperationalStatus.Values='[\"Unknown\",\"OK\",\"Error\",\"Starting\",\"Stopping\",\"Stopped\"]' override.OperationalStatus.MappingStrings='[\"JSR77.JCP|JSR77.5.1.1.1 state|V1.0\"]' override.OperationalStatus.ModelCorrespondence='[\"CIM_J2eeManagedObjectCapabilities.StateManageable\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeManagedObject extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * The default value is <code>"00000000000000.000000:000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the J2EE managed object was started, represented as a datetime interval measured as the time interval since January 1, 1970, 00:00:00. If the StateManageable property of the CIM_J2eeManagedObjectCapabilities class is false, this value MUST be set to a zero time interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeManagedObject_StartTime()
	 * @model default="00000000000000.000000:000"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"JSR77.JCP|JSR77.5.1.1.2 startTime|V1.0\"]' ModelCorrespondence='[\"CIM_J2eeManagedObjectCapabilities.StateManageable\"]'"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeManagedObject#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts the J2EE managed object. This operation can only be invoked in when State is Stopped. This method, causes State to become Starting initially, and eventually becomes the RUNNING state. Additionally, StartRecursive() is called on all the child StateManageable instances that are registered with this entity and are in the Stopped state. The method returns 0 on success and non-zero for failure.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"JSR77.JCP|JSR77.5.1.2.2 startRecursive|V1.0\"]'"
	 * @generated
	 */
	Long StartRecursive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method starts the J2EE managed object. This operation can only be invoked when the OperationalStatus is Stopped. Note that StartService() will not be called on any of the child StateManageable instances that are registered with this instance. It is the responsibility of the calling application to start the child if required. The method returns 0 on success and non-zero for failure.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"JSR77.JCP|JSR77.5.1.2.1 start|V1.0\"]'"
	 * @generated
	 */
	Long Start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method stops the J2EE managed object and all dependent objects that can be identified by following the Dependency/Component associations this object's identity participates in.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"JSR77.JCP|JSR77.5.1.2.3 stop|V1.0\"]'"
	 * @generated
	 */
	Long Stop();

} // CIM_J2eeManagedObject
