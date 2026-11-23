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
 * A representation of the model object '<em><b>CIM Service Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ServiceServiceDependency is an association between a Service and another Service, which indicates that the latter cooperates with the former, is required to be present, required to have completed, or must be absent for the former Service to provide its functionality. For example, Boot Services might be dependent upon underlying system initialization Services. In the case of the initialization Services, the Boot Service might be dependent on the completion of the init Services. 
 * When examining the ServiceServiceDependency class definition, note that its superclass ProvidesServiceToElement is deprecated. Unfortunately, ProvidesServiceToElement cannot be removed from the object hierarchy without a major Schema release. When or if a major release occurs, the ProvidesServiceToElement superclass will be removed, and ServiceServiceDependency will subclass from CIM_Dependency directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceServiceDependency#getTypeOfDependency <em>Type Of Dependency</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceServiceDependency#getRestartService <em>Restart Service</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceServiceDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.16.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_Service REF' override.Antecedent.Description='The required Service.' override.Dependent='CIM_Service REF' override.Dependent.Description='The Service that is dependent on an underlying Service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceServiceDependency extends CIM_ProvidesServiceToElement {
	/**
	 * Returns the value of the '<em><b>Type Of Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nature of the Service-to-Service dependency. 2 - Antecedent Service shall have completed before Dependent service's functionality is available.
	 * 3 - Antecedent Service shall have started before Dependent service's functionality is available.
	 * 4 - Antecedent Service shall not be started in order for Dependent service's functionality to be available.
	 * 5 - The two Services cooperate and augment each other's function. There is no requirement implied by this value regarding the execution of the Antecedent service in order for the Dependent service to operate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Dependency</em>' attribute.
	 * @see #setTypeOfDependency(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceServiceDependency_TypeOfDependency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Service Must Have Completed\",\"Service Must Be Started\",\"Service Must Not Be Started\",\"Cooperate\"]'"
	 * @generated
	 */
	Integer getTypeOfDependency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceServiceDependency#getTypeOfDependency <em>Type Of Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Dependency</em>' attribute.
	 * @see #getTypeOfDependency()
	 * @generated
	 */
	void setTypeOfDependency(Integer value);

	/**
	 * Returns the value of the '<em><b>Restart Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes that the Antecedent Service must be restarted after the Dependent operation is complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart Service</em>' attribute.
	 * @see #setRestartService(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceServiceDependency_RestartService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRestartService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceServiceDependency#getRestartService <em>Restart Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Service</em>' attribute.
	 * @see #getRestartService()
	 * @generated
	 */
	void setRestartService(Boolean value);

} // CIM_ServiceServiceDependency
