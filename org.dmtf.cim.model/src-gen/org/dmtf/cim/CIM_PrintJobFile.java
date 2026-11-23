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
 * A representation of the model object '<em><b>CIM Print Job File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates which files are associated with a PrintJob.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintJobFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Device::Printing' override.GroupComponent='CIM_PrintJob REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The PrintJob that is based on one or more Files.' override.PartComponent='CIM_DataFile REF' override.PartComponent.Description='The Files that make up a PrintJob.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PrintJobFile extends CIM_Component {
} // CIM_PrintJobFile
