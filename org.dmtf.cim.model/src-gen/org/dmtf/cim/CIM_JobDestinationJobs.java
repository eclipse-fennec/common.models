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
 * A representation of the model object '<em><b>CIM Job Destination Jobs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association describing where a Job is submitted for processing, ie to which JobDestination.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_JobDestinationJobs()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::Processing' override.Antecedent='CIM_JobDestination REF' override.Antecedent.Max='1' override.Antecedent.Description='The JobDestination, possibly a queue.' override.Dependent='CIM_Job REF' override.Dependent.Description='The Job that is in the Job queue/Destination.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_JobDestinationJobs extends CIM_Dependency {
} // CIM_JobDestinationJobs
