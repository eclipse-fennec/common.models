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
 * A representation of the model object '<em><b>CIM Printer Servicing Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates that PrintJobs can be passed to a Printer from a particular Queue.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrinterServicingQueue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Printing' override.Antecedent='CIM_Printer REF' override.Antecedent.Description='A destination Printer for Jobs enqueued on the Dependent Queue.' override.Dependent='CIM_PrintQueue REF' override.Dependent.Description='A Queue that is providing Jobs to the Printer.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PrinterServicingQueue extends CIM_Dependency {
} // CIM_PrinterServicingQueue
