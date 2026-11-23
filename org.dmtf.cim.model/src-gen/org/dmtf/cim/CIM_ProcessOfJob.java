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
 * A representation of the model object '<em><b>CIM Process Of Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ProcessOfJob describes that the referenced Process is the result of the execution of the Job. A Job may cause multiple Processes to run, perhaps on different operating systems. This is allowed by the '*' cardinality of the Process reference. Note that a Process can result from only one Job - hence, the '0..1' cardinality on Job.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProcessOfJob()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::System::Processing' override.GroupComponent='CIM_Job REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='Execution of the Job results in the creation of the Process referenced as PartComponent. The Job aggregates the Process(es) that are created when it is executed.' override.PartComponent='CIM_Process REF' override.PartComponent.Description='The Process that results from the execution of the Job.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ProcessOfJob extends CIM_Component {
} // CIM_ProcessOfJob
